package defpackage;

import android.graphics.Rect;
import android.text.Layout;
public final class xh9 implements pib {
    public final byte a;
    public final Object b;
    public final int c;
    public final int d;

    public xh9(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final Layout a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (Layout) obj;
            case 1:
                return (Layout) obj;
            case 2:
                return (Layout) obj;
            default:
                return ((pib) obj).a();
        }
    }

    @Override
    public final Rect c() {
        byte b = this.a;
        return null;
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return null;
            default:
                return ((pib) this.b).getPrefix();
        }
    }

    @Override
    public final int getRow() {
        switch (this.a) {
            case 0:
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((pib) this.b).getRow();
        }
    }

    @Override
    public final CharSequence getText() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((Layout) obj).getText();
            case 1:
                return ((Layout) obj).getText();
            case 2:
                return ((Layout) obj).getText();
            default:
                return ((pib) obj).getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.a) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            case 2:
                return this.c;
            default:
                return ((pib) this.b).getX() + this.c;
        }
    }

    @Override
    public final int getY() {
        switch (this.a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((pib) this.b).getY() + this.d;
        }
    }
}
