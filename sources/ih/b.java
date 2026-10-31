package ih;

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
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Components.mt;
import org.telegram.ui.a21;
import org.telegram.ui.w21;
import sg.e0;
public final class b extends mt {
    public final int Y1;
    public final Object Z1;

    public b(FrameLayout frameLayout, Context context, p6 p6Var, int i10) {
        super(context, p6Var);
        this.Y1 = i10;
        this.Z1 = frameLayout;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.Y1) {
            case 3:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.Z1;
                drawable.setBounds(0, i0.L(8.0f), i0.L(20.0f), i0.L(28.0f));
                drawable.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public int e() {
        switch (this.Y1) {
            case 0:
                return 3;
            case 1:
                return 3;
            default:
                return super.e();
        }
    }

    @Override
    public void invalidate() {
        switch (this.Y1) {
            case 2:
                if (!e0.f48320b) {
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
        switch (this.Y1) {
            case 0:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                editorInfo.imeOptions &= -1073741825;
                return onCreateInputConnection;
            case 1:
                InputConnection onCreateInputConnection2 = super.onCreateInputConnection(editorInfo);
                if (((e6) this.Z1).f21864s) {
                    editorInfo.imeOptions &= -1073741825;
                }
                return onCreateInputConnection2;
            default:
                return super.onCreateInputConnection(editorInfo);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.Y1) {
            case 1:
                super.onDraw(canvas);
                ((e6) this.Z1).getClass();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.Y1) {
            case 1:
                super.onFocusChanged(z10, i10, rect);
                ((e6) this.Z1).i(z10);
                return;
            case 2:
                if (z10) {
                    ((a21) this.Z1).F.q();
                    i0.h3(new w21(this, 0), 200L);
                }
                super.onFocusChanged(z10, i10, rect);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.Y1) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                postOnAnimation(new gg.c(this, 11));
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        switch (this.Y1) {
            case 1:
                if (i10 == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && i0.t(primaryClip.getItemAt(0).getText(), "\n") > 0) {
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < text.length(); i11++) {
                        char charAt = text.charAt(i11);
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
                    if (((e6) this.Z1).l(arrayList)) {
                        return true;
                    }
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.Y1) {
            case 1:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((e6) this.Z1).k(this);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                if (motionEvent.getAction() == 1 && ((a21) this.Z1).F.u()) {
                    i0.h3(new w21(this, 1), 200L);
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        switch (this.Y1) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback, i10);
                ((e6) this.Z1).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i10);
        }
    }

    public b(Context context, p6 p6Var, Drawable drawable) {
        super(context, p6Var);
        this.Y1 = 3;
        this.Z1 = drawable;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.Y1) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback);
                ((e6) this.Z1).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
