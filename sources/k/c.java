package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f9484a;
    public Resources.Theme f9485b;
    public LayoutInflater f9486c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f9484a = i10;
    }

    public final void a() {
        if (this.f9485b == null) {
            this.f9485b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9485b.setTo(theme);
            }
        }
        this.f9485b.applyStyle(this.f9484a, true);
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
            if (this.f9486c == null) {
                this.f9486c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f9486c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f9485b;
        if (theme != null) {
            return theme;
        }
        if (this.f9484a == 0) {
            this.f9484a = 2131755303;
        }
        a();
        return this.f9485b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f9484a != i10) {
            this.f9484a = i10;
            a();
        }
    }
}
