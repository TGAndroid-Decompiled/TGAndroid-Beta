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
    public static final int K = 0;
    public final int B;
    public int C;
    public ColorStateList D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final int f13453n;
    public final int f13454r;
    public final LayoutInflater f13455s;
    public final SearchView v;
    public final SearchableInfo f13456w;
    public final Context f13457x;
    public final WeakHashMap f13458y;

    public c3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f6874b = true;
        this.f6875c = null;
        this.f6873a = false;
        this.d = -1;
        this.e = new com.google.android.gms.internal.clearcut.c(this);
        this.f6876f = new h1.a(this, 0);
        this.f13454r = suggestionRowLayout;
        this.f13453n = suggestionRowLayout;
        this.f13455s = (LayoutInflater) context.getSystemService("layout_inflater");
        this.C = 1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.v = searchView;
        this.f13456w = searchableInfo;
        this.B = searchView.getSuggestionCommitIconResId();
        this.f13457x = context;
        this.f13458y = weakHashMap;
    }

    public static String g(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
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
                this.E = cursor.getColumnIndex("suggest_text_1");
                this.F = cursor.getColumnIndex("suggest_text_2");
                this.G = cursor.getColumnIndex("suggest_text_2_url");
                this.H = cursor.getColumnIndex("suggest_icon_1");
                this.I = cursor.getColumnIndex("suggest_icon_2");
                this.J = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
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
            SearchableInfo searchableInfo = this.f13456w;
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
                Resources resourcesForApplication = this.f13457x.getPackageManager().getResourcesForApplication(authority);
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
        return this.f13457x.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.f13455s.inflate(this.f13454r, viewGroup, false);
            if (inflate != null) {
                ((b3) inflate.getTag()).f13448a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.f13455s.inflate(this.f13453n, viewGroup, false);
            inflate.setTag(new b3(inflate));
            ((ImageView) inflate.findViewById(2131296420)).setImageResource(this.B);
            ((b3) inflate.getTag()).f13448a.setText(e.toString());
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
        Cursor cursor = this.f6875c;
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
        Cursor cursor = this.f6875c;
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
