package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f18060a;
    public Resources.Theme f18061b;
    public LayoutInflater f18062c;
    public Resources d;

    public c(Context context, int i7) {
        super(context);
        this.f18060a = i7;
    }

    public final void a() {
        if (this.f18061b == null) {
            this.f18061b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f18061b.setTo(theme);
            }
        }
        this.f18061b.applyStyle(this.f18060a, true);
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
            if (this.f18062c == null) {
                this.f18062c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f18062c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f18061b;
        if (theme != null) {
            return theme;
        }
        if (this.f18060a == 0) {
            this.f18060a = 2131755303;
        }
        a();
        return this.f18061b;
    }

    @Override
    public final void setTheme(int i7) {
        if (this.f18060a != i7) {
            this.f18060a = i7;
            a();
        }
    }
}
