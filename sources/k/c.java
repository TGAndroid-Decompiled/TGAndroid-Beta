package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f18057a;
    public Resources.Theme f18058b;
    public LayoutInflater f18059c;
    public Resources d;

    public c(Context context, int i7) {
        super(context);
        this.f18057a = i7;
    }

    public final void a() {
        if (this.f18058b == null) {
            this.f18058b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f18058b.setTo(theme);
            }
        }
        this.f18058b.applyStyle(this.f18057a, true);
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
            if (this.f18059c == null) {
                this.f18059c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f18059c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f18058b;
        if (theme != null) {
            return theme;
        }
        if (this.f18057a == 0) {
            this.f18057a = 2131755303;
        }
        a();
        return this.f18058b;
    }

    @Override
    public final void setTheme(int i7) {
        if (this.f18057a != i7) {
            this.f18057a = i7;
            a();
        }
    }
}
