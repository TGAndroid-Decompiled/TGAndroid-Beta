package bi;

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
import org.telegram.ui.Components.ft;
import org.telegram.ui.b11;
import org.telegram.ui.f01;
public final class u extends ft {
    public final int f3883e2;
    public final Object f3884f2;

    public u(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f3883e2 = i7;
        this.f3884f2 = frameLayout;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3883e2) {
            case 0:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.f3884f2;
                drawable.setBounds(0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(28.0f));
                drawable.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public int e() {
        switch (this.f3883e2) {
            case 1:
                return 3;
            case 2:
            default:
                return super.e();
            case 3:
                return 3;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f3883e2) {
            case 2:
                if (!ch.f0.f5065b) {
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
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        switch (this.f3883e2) {
            case 1:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                if (((org.telegram.ui.Cells.z5) this.f3884f2).f32122s) {
                    editorInfo.imeOptions &= -1073741825;
                }
                return onCreateInputConnection;
            case 2:
            default:
                return super.onCreateInputConnection(editorInfo);
            case 3:
                InputConnection onCreateInputConnection2 = super.onCreateInputConnection(editorInfo);
                editorInfo.imeOptions &= -1073741825;
                return onCreateInputConnection2;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3883e2) {
            case 1:
                super.onDraw(canvas);
                ((org.telegram.ui.Cells.z5) this.f3884f2).getClass();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i7, Rect rect) {
        switch (this.f3883e2) {
            case 1:
                super.onFocusChanged(z10, i7, rect);
                ((org.telegram.ui.Cells.z5) this.f3884f2).j(z10);
                return;
            case 2:
                if (z10) {
                    ((f01) this.f3884f2).G.q();
                    org.telegram.messenger.g0.i3(new b11(this, 0), 200L);
                }
                super.onFocusChanged(z10, i7, rect);
                return;
            default:
                super.onFocusChanged(z10, i7, rect);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f3883e2) {
            case 3:
                super.onSizeChanged(i7, i10, i11, i12);
                postOnAnimation(new q2.d(this, 13));
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i7) {
        ClipData primaryClip;
        switch (this.f3883e2) {
            case 1:
                if (i7 == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && org.telegram.messenger.g0.t(primaryClip.getItemAt(0).getText(), "\n") > 0) {
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < text.length(); i10++) {
                        char charAt = text.charAt(i10);
                        if (charAt == '\n') {
                            arrayList.add(sb2.toString());
                            sb2.setLength(0);
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    if (!TextUtils.isEmpty(sb2)) {
                        arrayList.add(sb2);
                    }
                    if (((org.telegram.ui.Cells.z5) this.f3884f2).m(arrayList)) {
                        return true;
                    }
                }
                return super.onTextContextMenuItem(i7);
            default:
                return super.onTextContextMenuItem(i7);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3883e2) {
            case 1:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.Cells.z5) this.f3884f2).l(this);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                if (motionEvent.getAction() == 1 && ((f01) this.f3884f2).G.u()) {
                    org.telegram.messenger.g0.i3(new b11(this, 1), 200L);
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        switch (this.f3883e2) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback, i7);
                ((org.telegram.ui.Cells.z5) this.f3884f2).h(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i7);
        }
    }

    public u(Context context, org.telegram.ui.ActionBar.e6 e6Var, Drawable drawable) {
        super(context, e6Var);
        this.f3883e2 = 0;
        this.f3884f2 = drawable;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.f3883e2) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback);
                ((org.telegram.ui.Cells.z5) this.f3884f2).h(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
