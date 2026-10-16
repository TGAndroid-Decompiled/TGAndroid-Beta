package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f13723a;
    public Resources.Theme f13724b;
    public LayoutInflater f13725c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f13723a = i10;
    }

    public final void a() {
        if (this.f13724b == null) {
            this.f13724b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13724b.setTo(theme);
            }
        }
        this.f13724b.applyStyle(this.f13723a, true);
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
            if (this.f13725c == null) {
                this.f13725c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f13725c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f13724b;
        if (theme != null) {
            return theme;
        }
        if (this.f13723a == 0) {
            this.f13723a = 2131755303;
        }
        a();
        return this.f13724b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f13723a != i10) {
            this.f13723a = i10;
            a();
        }
    }
}
