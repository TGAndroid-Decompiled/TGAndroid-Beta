package defpackage;

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
import java.util.List;
import java.util.WeakHashMap;
public final class kbb extends d43 implements View.OnClickListener {
    public static final int O = 0;
    public final WeakHashMap E;
    public final int F;
    public byte G;
    public ColorStateList H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final int n;
    public final int r;
    public final LayoutInflater s;
    public final SearchView w;
    public final SearchableInfo x;
    public final Context y;

    public kbb(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.b = true;
        this.c = null;
        this.a = false;
        this.d = -1;
        this.e = new b43(this);
        this.f = new c43(this, (byte) 0);
        this.r = suggestionRowLayout;
        this.n = suggestionRowLayout;
        this.s = (LayoutInflater) context.getSystemService("layout_inflater");
        this.G = (byte) 1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.w = searchView;
        this.x = searchableInfo;
        this.F = searchView.getSuggestionCommitIconResId();
        this.y = context;
        this.E = weakHashMap;
    }

    public static String g(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override
    public final void a(android.view.View r21, android.database.Cursor r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbb.a(android.view.View, android.database.Cursor):void");
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
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override
    public final String c(Cursor cursor) {
        String g;
        String g2;
        if (cursor != null) {
            String g3 = g(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (g3 != null) {
                return g3;
            }
            SearchableInfo searchableInfo = this.x;
            if (searchableInfo.shouldRewriteQueryFromData() && (g2 = g(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
                return g2;
            }
            if (searchableInfo.shouldRewriteQueryFromText() && (g = g(cursor, cursor.getColumnIndex("suggest_text_1"))) != null) {
                return g;
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
                Resources resourcesForApplication = this.y.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            v0b.b(uri, "Single path segment is not a resource ID: ");
                            return null;
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        v0b.b(uri, "More than two path segments: ");
                        return null;
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    v0b.b(uri, "No resource found for: ");
                    return null;
                }
                v0b.b(uri, "No path: ");
                return null;
            } catch (PackageManager.NameNotFoundException unused2) {
                v0b.b(uri, "No package found for authority: ");
                return null;
            }
        }
        v0b.b(uri, "No authority: ");
        return null;
    }

    public final android.graphics.drawable.Drawable e(java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbb.e(java.lang.String):android.graphics.drawable.Drawable");
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
        return this.y.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.s.inflate(this.r, viewGroup, false);
            if (inflate != null) {
                ((jbb) inflate.getTag()).a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.s.inflate(this.n, viewGroup, false);
            inflate.setTag(new jbb(inflate));
            ((ImageView) inflate.findViewById(2131296422)).setImageResource(this.F);
            ((jbb) inflate.getTag()).a.setText(e.toString());
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
        Cursor cursor = this.c;
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
        Cursor cursor = this.c;
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
            this.w.o((CharSequence) tag);
        }
    }
}
