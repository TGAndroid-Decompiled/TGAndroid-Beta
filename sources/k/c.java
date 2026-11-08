package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f17107a;
    public Resources.Theme f17108b;
    public LayoutInflater f17109c;
    public Resources d;

    public c(Context context, int i7) {
        super(context);
        this.f17107a = i7;
    }

    public final void a() {
        if (this.f17108b == null) {
            this.f17108b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f17108b.setTo(theme);
            }
        }
        this.f17108b.applyStyle(this.f17107a, true);
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
            if (this.f17109c == null) {
                this.f17109c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f17109c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f17108b;
        if (theme != null) {
            return theme;
        }
        if (this.f17107a == 0) {
            this.f17107a = 2131755303;
        }
        a();
        return this.f17108b;
    }

    @Override
    public final void setTheme(int i7) {
        if (this.f17107a != i7) {
            this.f17107a = i7;
            a();
        }
    }
}
