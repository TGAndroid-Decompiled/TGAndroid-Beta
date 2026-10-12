package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f13720a;
    public Resources.Theme f13721b;
    public LayoutInflater f13722c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f13720a = i10;
    }

    public final void a() {
        if (this.f13721b == null) {
            this.f13721b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13721b.setTo(theme);
            }
        }
        this.f13721b.applyStyle(this.f13720a, true);
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
            if (this.f13722c == null) {
                this.f13722c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f13722c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f13721b;
        if (theme != null) {
            return theme;
        }
        if (this.f13720a == 0) {
            this.f13720a = 2131755303;
        }
        a();
        return this.f13721b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f13720a != i10) {
            this.f13720a = i10;
            a();
        }
    }
}
