package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;
public final class a5 implements u9 {
    public final int f21962a;
    public final Object f21963b;
    public final int f21964c;
    public final int d;

    public a5(Object obj, int i7, int i10, int i11) {
        this.f21962a = i11;
        this.f21963b = obj;
        this.f21964c = i7;
        this.d = i10;
    }

    @Override
    public final Layout a() {
        switch (this.f21962a) {
            case 0:
                return (Layout) this.f21963b;
            case 1:
                return (Layout) this.f21963b;
            case 2:
                return (Layout) this.f21963b;
            default:
                return ((u9) this.f21963b).a();
        }
    }

    @Override
    public final Rect c() {
        switch (this.f21962a) {
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
        switch (this.f21962a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return ((u9) this.f21963b).getPrefix();
        }
    }

    @Override
    public final int getRow() {
        switch (this.f21962a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((u9) this.f21963b).getRow();
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f21962a) {
            case 0:
                return ((Layout) this.f21963b).getText();
            case 1:
                return ((Layout) this.f21963b).getText();
            case 2:
                return ((Layout) this.f21963b).getText();
            default:
                return ((u9) this.f21963b).getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f21962a) {
            case 0:
                return this.f21964c;
            case 1:
                return this.f21964c;
            case 2:
                return this.f21964c;
            default:
                return ((u9) this.f21963b).getX() + this.f21964c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f21962a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((u9) this.f21963b).getY() + this.d;
        }
    }
}
