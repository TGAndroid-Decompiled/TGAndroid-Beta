package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f13097a;
    public Resources.Theme f13098b;
    public LayoutInflater f13099c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f13097a = i10;
    }

    public final void a() {
        if (this.f13098b == null) {
            this.f13098b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13098b.setTo(theme);
            }
        }
        this.f13098b.applyStyle(this.f13097a, true);
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
            if (this.f13099c == null) {
                this.f13099c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f13099c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f13098b;
        if (theme != null) {
            return theme;
        }
        if (this.f13097a == 0) {
            this.f13097a = 2131755303;
        }
        a();
        return this.f13098b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f13097a != i10) {
            this.f13097a = i10;
            a();
        }
    }
}
