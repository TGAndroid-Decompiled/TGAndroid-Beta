package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f10198a;
    public Resources.Theme f10199b;
    public LayoutInflater f10200c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f10198a = i10;
    }

    public final void a() {
        if (this.f10199b == null) {
            this.f10199b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f10199b.setTo(theme);
            }
        }
        this.f10199b.applyStyle(this.f10198a, true);
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
            if (this.f10200c == null) {
                this.f10200c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f10200c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f10199b;
        if (theme != null) {
            return theme;
        }
        if (this.f10198a == 0) {
            this.f10198a = 2131755303;
        }
        a();
        return this.f10199b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f10198a != i10) {
            this.f10198a = i10;
            a();
        }
    }
}
