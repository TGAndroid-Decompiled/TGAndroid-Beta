package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f17104a;
    public Resources.Theme f17105b;
    public LayoutInflater f17106c;
    public Resources d;

    public c(Context context, int i7) {
        super(context);
        this.f17104a = i7;
    }

    public final void a() {
        if (this.f17105b == null) {
            this.f17105b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f17105b.setTo(theme);
            }
        }
        this.f17105b.applyStyle(this.f17104a, true);
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
            if (this.f17106c == null) {
                this.f17106c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f17106c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f17105b;
        if (theme != null) {
            return theme;
        }
        if (this.f17104a == 0) {
            this.f17104a = 2131755303;
        }
        a();
        return this.f17105b;
    }

    @Override
    public final void setTheme(int i7) {
        if (this.f17104a != i7) {
            this.f17104a = i7;
            a();
        }
    }
}
