package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f9503a;
    public Resources.Theme f9504b;
    public LayoutInflater f9505c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f9503a = i10;
    }

    public final void a() {
        if (this.f9504b == null) {
            this.f9504b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9504b.setTo(theme);
            }
        }
        this.f9504b.applyStyle(this.f9503a, true);
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
            if (this.f9505c == null) {
                this.f9505c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f9505c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f9504b;
        if (theme != null) {
            return theme;
        }
        if (this.f9503a == 0) {
            this.f9503a = 2131755303;
        }
        a();
        return this.f9504b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f9503a != i10) {
            this.f9503a = i10;
            a();
        }
    }
}
