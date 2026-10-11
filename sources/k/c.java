package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f14275a;
    public Resources.Theme f14276b;
    public LayoutInflater f14277c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f14275a = i10;
    }

    public final void a() {
        if (this.f14276b == null) {
            this.f14276b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f14276b.setTo(theme);
            }
        }
        this.f14276b.applyStyle(this.f14275a, true);
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
        if (this.d == null) {
            this.d = super.getResources();
        }
        return this.d;
    }

    @Override
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f14277c == null) {
                this.f14277c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f14277c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f14276b;
        if (theme != null) {
            return theme;
        }
        if (this.f14275a == 0) {
            this.f14275a = 2131755303;
        }
        a();
        return this.f14276b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f14275a != i10) {
            this.f14275a = i10;
            a();
        }
    }
}
