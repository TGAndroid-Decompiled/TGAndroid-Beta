package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.t9;
public final class b5 implements t9 {
    public final int f18475a;
    public final Object f18476b;
    public final int f18477c;
    public final int d;

    public b5(Object obj, int i7, int i10, int i11) {
        this.f18475a = i11;
        this.f18476b = obj;
        this.f18477c = i7;
        this.d = i10;
    }

    @Override
    public final Layout a() {
        switch (this.f18475a) {
            case 0:
                return (Layout) this.f18476b;
            case 1:
                return (Layout) this.f18476b;
            case 2:
                return (Layout) this.f18476b;
            default:
                return ((t9) this.f18476b).a();
        }
    }

    @Override
    public final Rect c() {
        switch (this.f18475a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f18475a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return ((t9) this.f18476b).getPrefix();
        }
    }

    @Override
    public final int getRow() {
        switch (this.f18475a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((t9) this.f18476b).getRow();
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f18475a) {
            case 0:
                return ((Layout) this.f18476b).getText();
            case 1:
                return ((Layout) this.f18476b).getText();
            case 2:
                return ((Layout) this.f18476b).getText();
            default:
                return ((t9) this.f18476b).getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f18475a) {
            case 0:
                return this.f18477c;
            case 1:
                return this.f18477c;
            case 2:
                return this.f18477c;
            default:
                return ((t9) this.f18476b).getX() + this.f18477c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f18475a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((t9) this.f18476b).getY() + this.d;
        }
    }
}
