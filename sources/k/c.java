package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f13107a;
    public Resources.Theme f13108b;
    public LayoutInflater f13109c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f13107a = i10;
    }

    public final void a() {
        if (this.f13108b == null) {
            this.f13108b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13108b.setTo(theme);
            }
        }
        this.f13108b.applyStyle(this.f13107a, true);
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
            if (this.f13109c == null) {
                this.f13109c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f13109c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f13108b;
        if (theme != null) {
            return theme;
        }
        if (this.f13107a == 0) {
            this.f13107a = 2131755303;
        }
        a();
        return this.f13108b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f13107a != i10) {
            this.f13107a = i10;
            a();
        }
    }
}
