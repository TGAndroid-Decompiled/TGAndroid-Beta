package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f17665a;
    public Resources.Theme f17666b;
    public LayoutInflater f17667c;
    public Resources d;

    public c(Context context, int i7) {
        super(context);
        this.f17665a = i7;
    }

    public final void a() {
        if (this.f17666b == null) {
            this.f17666b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f17666b.setTo(theme);
            }
        }
        this.f17666b.applyStyle(this.f17665a, true);
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
            if (this.f17667c == null) {
                this.f17667c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f17667c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f17666b;
        if (theme != null) {
            return theme;
        }
        if (this.f17665a == 0) {
            this.f17665a = 2131755303;
        }
        a();
        return this.f17666b;
    }

    @Override
    public final void setTheme(int i7) {
        if (this.f17665a != i7) {
            this.f17665a = i7;
            a();
        }
    }
}
