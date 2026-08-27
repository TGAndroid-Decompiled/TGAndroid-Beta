package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class c extends ContextWrapper {

    public int f14208a;

    public Resources.Theme f14209b;

    public LayoutInflater f14210c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f14208a = i10;
    }

    public final void a() {
        if (this.f14209b == null) {
            this.f14209b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f14209b.setTo(theme);
            }
        }
        this.f14209b.applyStyle(this.f14208a, true);
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
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f14210c == null) {
            this.f14210c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f14210c;
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f14209b;
        if (theme != null) {
            return theme;
        }
        if (this.f14208a == 0) {
            this.f14208a = 2131755303;
        }
        a();
        return this.f14209b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f14208a != i10) {
            this.f14208a = i10;
            a();
        }
    }
}
