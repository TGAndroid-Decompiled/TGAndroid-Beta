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
public final class y2 extends i1.a implements View.OnClickListener {
    public static final int O = 0;
    public final WeakHashMap E;
    public final int F;
    public int G;
    public ColorStateList H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final int f20291n;
    public final int f20292r;
    public final LayoutInflater f20293s;
    public final SearchView f20294w;
    public final SearchableInfo f20295x;
    public final Context f20296y;

    public y2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f15936b = true;
        this.f15937c = null;
        this.f15935a = false;
        this.d = -1;
        this.f15938e = new com.google.android.gms.internal.clearcut.c(this);
        this.f15939f = new c5.i(this, 1);
        this.f20292r = suggestionRowLayout;
        this.f20291n = suggestionRowLayout;
        this.f20293s = (LayoutInflater) context.getSystemService("layout_inflater");
        this.G = 1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.f20294w = searchView;
        this.f20295x = searchableInfo;
        this.F = searchView.getSuggestionCommitIconResId();
        this.f20296y = context;
        this.E = weakHashMap;
    }

    public static String g(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    @Override
    public final void a(android.view.View r21, android.database.Cursor r22) {
        throw new UnsupportedOperationException("Method not decompiled: m.y2.a(android.view.View, android.database.Cursor):void");
    }

    @Override
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.I = cursor.getColumnIndex("suggest_text_1");
                this.J = cursor.getColumnIndex("suggest_text_2");
                this.K = cursor.getColumnIndex("suggest_text_2_url");
                this.L = cursor.getColumnIndex("suggest_icon_1");
                this.M = cursor.getColumnIndex("suggest_icon_2");
                this.N = cursor.getColumnIndex("suggest_flags");
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
            SearchableInfo searchableInfo = this.f20295x;
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
                Resources resourcesForApplication = this.f20296y.getPackageManager().getResourcesForApplication(authority);
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
        throw new UnsupportedOperationException("Method not decompiled: m.y2.e(java.lang.String):android.graphics.drawable.Drawable");
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
        return this.f20296y.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override
    public final View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f20293s.inflate(this.f20292r, viewGroup, false);
            if (inflate != null) {
                ((x2) inflate.getTag()).f20283a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f20293s.inflate(this.f20291n, viewGroup, false);
            inflate.setTag(new x2(inflate));
            ((ImageView) inflate.findViewById(2131296422)).setImageResource(this.F);
            ((x2) inflate.getTag()).f20283a.setText(e10.toString());
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
        Cursor cursor = this.f15937c;
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
        Cursor cursor = this.f15937c;
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
            this.f20294w.o((CharSequence) tag);
        }
    }
}
