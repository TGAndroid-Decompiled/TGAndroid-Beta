package m;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
public final class c3 extends h1.b implements View.OnClickListener {
    public static final int J = 0;
    public final int A;
    public int B;
    public ColorStateList C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int f16507n;
    public final int f16508r;
    public final LayoutInflater f16509s;
    public final SearchView v;
    public final SearchableInfo f16510w;
    public final Context f16511x;
    public final WeakHashMap f16512y;

    public c3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f7505b = true;
        this.f7506c = null;
        this.f7504a = false;
        this.d = -1;
        this.f7507e = new com.google.android.gms.internal.clearcut.c(this);
        this.f7508f = new h1.a(this, 0);
        this.f16508r = suggestionRowLayout;
        this.f16507n = suggestionRowLayout;
        this.f16509s = (LayoutInflater) context.getSystemService("layout_inflater");
        this.B = 1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.v = searchView;
        this.f16510w = searchableInfo;
        this.A = searchView.getSuggestionCommitIconResId();
        this.f16511x = context;
        this.f16512y = weakHashMap;
    }

    public static String g(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    @Override
    public final void a(android.view.View r21, android.database.Cursor r22) {
        throw new UnsupportedOperationException("Method not decompiled: m.c3.a(android.view.View, android.database.Cursor):void");
    }

    @Override
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.D = cursor.getColumnIndex("suggest_text_1");
                this.E = cursor.getColumnIndex("suggest_text_2");
                this.F = cursor.getColumnIndex("suggest_text_2_url");
                this.G = cursor.getColumnIndex("suggest_icon_1");
                this.H = cursor.getColumnIndex("suggest_icon_2");
                this.I = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override
    public final String c(Cursor cursor) {
        String g10;
        String g11;
        if (cursor != null) {
            String g12 = g(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (g12 != null) {
                return g12;
            }
            SearchableInfo searchableInfo = this.f16510w;
            if (searchableInfo.shouldRewriteQueryFromData() && (g11 = g(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
                return g11;
            }
            if (searchableInfo.shouldRewriteQueryFromText() && (g10 = g(cursor, cursor.getColumnIndex("suggest_text_1"))) != null) {
                return g10;
            }
            return null;
        }
        return null;
    }

    public final Drawable d(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f16511x.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    public final android.graphics.drawable.Drawable e(java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: m.c3.e(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor f(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f16511x.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f16509s.inflate(this.f16508r, viewGroup, false);
            if (inflate != null) {
                ((b3) inflate.getTag()).f16502a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f16509s.inflate(this.f16507n, viewGroup, false);
            inflate.setTag(new b3(inflate));
            ((ImageView) inflate.findViewById(2131296420)).setImageResource(this.A);
            ((b3) inflate.getTag()).f16502a.setText(e10.toString());
            return inflate;
        }
    }

    @Override
    public final boolean hasStableIds() {
        return false;
    }

    @Override
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f7506c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f7506c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.v.o((CharSequence) tag);
        }
    }
}
