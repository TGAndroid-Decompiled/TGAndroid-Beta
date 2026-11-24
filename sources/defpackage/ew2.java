package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class ew2 extends ContextWrapper {
    public int a;
    public Resources.Theme b;
    public LayoutInflater c;
    public Resources d;

    public ew2(Context context, int i) {
        super(context);
        this.a = i;
    }

    public final void a() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    @Override
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override
    public final Resources getResources() {
        Resources resources = this.d;
        if (resources == null) {
            Resources resources2 = super.getResources();
            this.d = resources2;
            return resources2;
        }
        return resources;
    }

    @Override
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            LayoutInflater layoutInflater = this.c;
            if (layoutInflater == null) {
                LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
                this.c = cloneInContext;
                return cloneInContext;
            }
            return layoutInflater;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = 2131755303;
        }
        a();
        return this.b;
    }

    @Override
    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            a();
        }
    }
}
