package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f16386a;
    public Resources.Theme f16387b;
    public LayoutInflater f16388c;
    public Resources d;

    public c(Context context, int i3) {
        super(context);
        this.f16386a = i3;
    }

    public final void a() {
        if (this.f16387b == null) {
            this.f16387b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f16387b.setTo(theme);
            }
        }
        this.f16387b.applyStyle(this.f16386a, true);
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
            if (this.f16388c == null) {
                this.f16388c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f16388c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f16387b;
        if (theme != null) {
            return theme;
        }
        if (this.f16386a == 0) {
            this.f16386a = 2131755303;
        }
        a();
        return this.f16387b;
    }

    @Override
    public final void setTheme(int i3) {
        if (this.f16386a != i3) {
            this.f16386a = i3;
            a();
        }
    }
}
