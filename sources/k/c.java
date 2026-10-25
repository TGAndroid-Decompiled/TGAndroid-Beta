package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f16002a;
    public Resources.Theme f16003b;
    public LayoutInflater f16004c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f16002a = i10;
    }

    public final void a() {
        if (this.f16003b == null) {
            this.f16003b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f16003b.setTo(theme);
            }
        }
        this.f16003b.applyStyle(this.f16002a, true);
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
            if (this.f16004c == null) {
                this.f16004c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f16004c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f16003b;
        if (theme != null) {
            return theme;
        }
        if (this.f16002a == 0) {
            this.f16002a = 2131755303;
        }
        a();
        return this.f16003b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f16002a != i10) {
            this.f16002a = i10;
            a();
        }
    }
}
