package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f11951a;
    public Resources.Theme f11952b;
    public LayoutInflater f11953c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f11951a = i10;
    }

    public final void a() {
        if (this.f11952b == null) {
            this.f11952b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f11952b.setTo(theme);
            }
        }
        this.f11952b.applyStyle(this.f11951a, true);
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
            if (this.f11953c == null) {
                this.f11953c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f11953c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f11952b;
        if (theme != null) {
            return theme;
        }
        if (this.f11951a == 0) {
            this.f11951a = 2131755303;
        }
        a();
        return this.f11952b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f11951a != i10) {
            this.f11951a = i10;
            a();
        }
    }
}
