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
public final class py extends gt3 {
    public final byte e2;
    public final Object f2;

    public py(Context context, wjb wjbVar, Drawable drawable) {
        super(context, wjbVar);
        this.e2 = (byte) 0;
        this.f2 = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.e2) {
            case 0:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.f2;
                drawable.setBounds(0, gl.L(8.0f), gl.L(20.0f), gl.L(28.0f));
                drawable.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final int e() {
        switch (this.e2) {
            case 1:
            case 2:
                return 3;
            default:
                return super.e();
        }
    }

    @Override
    public final void invalidate() {
        switch (this.e2) {
            case 3:
                if (!pg5.b) {
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
        switch (this.e2) {
            case 1:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                editorInfo.imeOptions &= -1073741825;
                return onCreateInputConnection;
            case 2:
                InputConnection onCreateInputConnection2 = super.onCreateInputConnection(editorInfo);
                if (((le8) this.f2).s) {
                    editorInfo.imeOptions &= -1073741825;
                }
                return onCreateInputConnection2;
            default:
                return super.onCreateInputConnection(editorInfo);
        }
    }

    @Override
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        byte b = this.e2;
        Object obj = this.f2;
        switch (b) {
            case 2:
                super.onFocusChanged(z, i, rect);
                ((le8) obj).j(z);
                return;
            case 3:
                if (z) {
                    ((lw9) obj).G.p();
                    gl.d3(new hx9(this, (byte) 0), 200L);
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
        switch (this.e2) {
            case 1:
                super.onSizeChanged(i, i2, i3, i4);
                postOnAnimation(new qn1(this, (byte) 1));
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        switch (this.e2) {
            case 2:
                if (i == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && gl.t(primaryClip.getItemAt(0).getText(), "\n") > 0) {
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
                    if (((le8) this.f2).m(arrayList)) {
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
        byte b = this.e2;
        Object obj = this.f2;
        switch (b) {
            case 2:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((le8) obj).l(this);
                }
                return super.onTouchEvent(motionEvent);
            case 3:
                if (motionEvent.getAction() == 1 && ((lw9) obj).G.t()) {
                    gl.d3(new hx9(this, (byte) 1), 200L);
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        switch (this.e2) {
            case 2:
                ActionMode startActionMode = super.startActionMode(callback, i);
                ((le8) this.f2).h(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i);
        }
    }

    public py(FrameLayout frameLayout, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.e2 = b;
        this.f2 = frameLayout;
    }

    @Override
    public final ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.e2) {
            case 2:
                ActionMode startActionMode = super.startActionMode(callback);
                ((le8) this.f2).h(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
