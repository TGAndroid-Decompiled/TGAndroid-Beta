package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f14391a;
    public Resources.Theme f14392b;
    public LayoutInflater f14393c;
    public Resources d;

    public c(Context context, int i9) {
        super(context);
        this.f14391a = i9;
    }

    public final void a() {
        if (this.f14392b == null) {
            this.f14392b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f14392b.setTo(theme);
            }
        }
        this.f14392b.applyStyle(this.f14391a, true);
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
            if (this.f14393c == null) {
                this.f14393c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f14393c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f14392b;
        if (theme != null) {
            return theme;
        }
        if (this.f14391a == 0) {
            this.f14391a = 2131755303;
        }
        a();
        return this.f14392b;
    }

    @Override
    public final void setTheme(int i9) {
        if (this.f14391a != i9) {
            this.f14391a = i9;
            a();
        }
    }
}
