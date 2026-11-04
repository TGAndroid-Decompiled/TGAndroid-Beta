package ai;

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
import org.telegram.ui.Components.xs;
import org.telegram.ui.u01;
import org.telegram.ui.yz0;
public final class z extends xs {
    public final int Z1;
    public final Object f1121a2;

    public z(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.Z1 = i3;
        this.f1121a2 = frameLayout;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.Z1) {
            case 0:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.f1121a2;
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
        switch (this.Z1) {
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
        switch (this.Z1) {
            case 2:
                if (!dh.d0.f8983b) {
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
        switch (this.Z1) {
            case 1:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                if (((org.telegram.ui.Cells.z5) this.f1121a2).f31052s) {
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
        switch (this.Z1) {
            case 1:
                super.onDraw(canvas);
                ((org.telegram.ui.Cells.z5) this.f1121a2).getClass();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i3, Rect rect) {
        switch (this.Z1) {
            case 1:
                super.onFocusChanged(z10, i3, rect);
                ((org.telegram.ui.Cells.z5) this.f1121a2).i(z10);
                return;
            case 2:
                if (z10) {
                    ((yz0) this.f1121a2).G.q();
                    org.telegram.messenger.g0.i3(new u01(this, 0), 200L);
                }
                super.onFocusChanged(z10, i3, rect);
                return;
            default:
                super.onFocusChanged(z10, i3, rect);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.Z1) {
            case 3:
                super.onSizeChanged(i3, i10, i11, i12);
                postOnAnimation(new r4.u(this, 10));
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i3) {
        ClipData primaryClip;
        switch (this.Z1) {
            case 1:
                if (i3 == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && org.telegram.messenger.g0.t(primaryClip.getItemAt(0).getText(), "\n") > 0) {
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
                    if (((org.telegram.ui.Cells.z5) this.f1121a2).l(arrayList)) {
                        return true;
                    }
                }
                return super.onTextContextMenuItem(i3);
            default:
                return super.onTextContextMenuItem(i3);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.Z1) {
            case 1:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.Cells.z5) this.f1121a2).k(this);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                if (motionEvent.getAction() == 1 && ((yz0) this.f1121a2).G.u()) {
                    org.telegram.messenger.g0.i3(new u01(this, 1), 200L);
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i3) {
        switch (this.Z1) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback, i3);
                ((org.telegram.ui.Cells.z5) this.f1121a2).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i3);
        }
    }

    public z(Context context, org.telegram.ui.ActionBar.e6 e6Var, Drawable drawable) {
        super(context, e6Var);
        this.Z1 = 0;
        this.f1121a2 = drawable;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.Z1) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback);
                ((org.telegram.ui.Cells.z5) this.f1121a2).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
