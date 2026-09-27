package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
public final class c extends ContextWrapper {
    public int f13100a;
    public Resources.Theme f13101b;
    public LayoutInflater f13102c;
    public Resources d;

    public c(Context context, int i10) {
        super(context);
        this.f13100a = i10;
    }

    public final void a() {
        if (this.f13101b == null) {
            this.f13101b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13101b.setTo(theme);
            }
        }
        this.f13101b.applyStyle(this.f13100a, true);
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
            if (this.f13102c == null) {
                this.f13102c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f13102c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f13101b;
        if (theme != null) {
            return theme;
        }
        if (this.f13100a == 0) {
            this.f13100a = 2131755303;
        }
        a();
        return this.f13101b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f13100a != i10) {
            this.f13100a = i10;
            a();
        }
    }
}
