package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.t9;
public final class b5 implements t9 {
    public final int f18478a;
    public final Object f18479b;
    public final int f18480c;
    public final int d;

    public b5(Object obj, int i7, int i10, int i11) {
        this.f18478a = i11;
        this.f18479b = obj;
        this.f18480c = i7;
        this.d = i10;
    }

    @Override
    public final Layout a() {
        switch (this.f18478a) {
            case 0:
                return (Layout) this.f18479b;
            case 1:
                return (Layout) this.f18479b;
            case 2:
                return (Layout) this.f18479b;
            default:
                return ((t9) this.f18479b).a();
        }
    }

    @Override
    public final Rect c() {
        switch (this.f18478a) {
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
        switch (this.f18478a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return ((t9) this.f18479b).getPrefix();
        }
    }

    @Override
    public final int getRow() {
        switch (this.f18478a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((t9) this.f18479b).getRow();
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f18478a) {
            case 0:
                return ((Layout) this.f18479b).getText();
            case 1:
                return ((Layout) this.f18479b).getText();
            case 2:
                return ((Layout) this.f18479b).getText();
            default:
                return ((t9) this.f18479b).getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f18478a) {
            case 0:
                return this.f18480c;
            case 1:
                return this.f18480c;
            case 2:
                return this.f18480c;
            default:
                return ((t9) this.f18479b).getX() + this.f18480c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f18478a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((t9) this.f18479b).getY() + this.d;
        }
    }
}
