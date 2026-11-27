package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class qy extends xt3 {
    public final byte f2;
    public final Object g2;

    public qy(Context context, vnb vnbVar, Drawable drawable) {
        super(context, vnbVar);
        this.f2 = (byte) 0;
        this.g2 = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f2) {
            case 0:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.g2;
                drawable.setBounds(0, hl.L(8.0f), hl.L(20.0f), hl.L(28.0f));
                drawable.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final int e() {
        switch (this.f2) {
            case 1:
            case 2:
                return 3;
            default:
                return super.e();
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f2) {
            case 3:
                if (!ri5.b) {
                    super.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        switch (this.f2) {
            case 1:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                editorInfo.imeOptions &= -1073741825;
                return onCreateInputConnection;
            case 2:
                InputConnection onCreateInputConnection2 = super.onCreateInputConnection(editorInfo);
                if (((zh8) this.g2).s) {
                    editorInfo.imeOptions &= -1073741825;
                }
                return onCreateInputConnection2;
            default:
                return super.onCreateInputConnection(editorInfo);
        }
    }

    @Override
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        byte b = this.f2;
        Object obj = this.g2;
        switch (b) {
            case 2:
                super.onFocusChanged(z, i, rect);
                ((zh8) obj).j(z);
                return;
            case 3:
                if (z) {
                    ((e0a) obj).G.p();
                    hl.d3(new a1a(this, (byte) 0), 200L);
                }
                super.onFocusChanged(z, i, rect);
                return;
            default:
                super.onFocusChanged(z, i, rect);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.f2) {
            case 1:
                super.onSizeChanged(i, i2, i3, i4);
                postOnAnimation(new lo1(this, (byte) 1));
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        switch (this.f2) {
            case 2:
                if (i == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && hl.t(primaryClip.getItemAt(0).getText(), "\n") > 0) {
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < text.length(); i2++) {
                        char charAt = text.charAt(i2);
                        if (charAt == '\n') {
                            arrayList.add(sb.toString());
                            sb.setLength(0);
                        } else {
                            sb.append(charAt);
                        }
                    }
                    if (!TextUtils.isEmpty(sb)) {
                        arrayList.add(sb);
                    }
                    if (((zh8) this.g2).m(arrayList)) {
                        return true;
                    }
                }
                return super.onTextContextMenuItem(i);
            default:
                return super.onTextContextMenuItem(i);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b = this.f2;
        Object obj = this.g2;
        switch (b) {
            case 2:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((zh8) obj).l(this);
                }
                return super.onTouchEvent(motionEvent);
            case 3:
                if (motionEvent.getAction() == 1 && ((e0a) obj).G.t()) {
                    hl.d3(new a1a(this, (byte) 1), 200L);
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        switch (this.f2) {
            case 2:
                ActionMode startActionMode = super.startActionMode(callback, i);
                ((zh8) this.g2).h(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i);
        }
    }

    public qy(FrameLayout frameLayout, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.f2 = b;
        this.g2 = frameLayout;
    }

    @Override
    public final ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.f2) {
            case 2:
                ActionMode startActionMode = super.startActionMode(callback);
                ((zh8) this.g2).h(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
