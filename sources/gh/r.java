package gh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lt;
import org.telegram.ui.n51;
import org.telegram.ui.r41;

public final class r extends lt {

    public final int f7511c;
    public final Object d;

    public r(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.f7511c = i10;
        this.d = frameLayout;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f7511c) {
            case 0:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.d;
                drawable.setBounds(0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(28.0f));
                drawable.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public int emojiCacheType() {
        switch (this.f7511c) {
            case 1:
                return 3;
            case 2:
            default:
                return super.emojiCacheType();
            case 3:
                return 3;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f7511c) {
            case 2:
                if (!ig.g0.f11303b) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        switch (this.f7511c) {
            case 1:
                InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
                if (((org.telegram.ui.Cells.z5) this.d).f26038s) {
                    editorInfo.imeOptions &= -1073741825;
                }
                return inputConnectionOnCreateInputConnection;
            case 2:
            default:
                return super.onCreateInputConnection(editorInfo);
            case 3:
                InputConnection inputConnectionOnCreateInputConnection2 = super.onCreateInputConnection(editorInfo);
                editorInfo.imeOptions &= -1073741825;
                return inputConnectionOnCreateInputConnection2;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f7511c) {
            case 1:
                super.onDraw(canvas);
                ((org.telegram.ui.Cells.z5) this.d).getClass();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.f7511c) {
            case 1:
                super.onFocusChanged(z10, i10, rect);
                ((org.telegram.ui.Cells.z5) this.d).i(z10);
                break;
            case 2:
                if (z10) {
                    ((r41) this.d).f41282y.q();
                    AndroidUtilities.runOnUIThread(new n51(this, 0), 200L);
                }
                super.onFocusChanged(z10, i10, rect);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f7511c) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                postOnAnimation(new qf.b(this, 29));
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        switch (this.f7511c) {
            case 1:
                if (i10 == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && AndroidUtilities.charSequenceIndexOf(primaryClip.getItemAt(0).getText(), "\n") > 0) {
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < text.length(); i11++) {
                        char cCharAt = text.charAt(i11);
                        if (cCharAt == '\n') {
                            arrayList.add(sb2.toString());
                            sb2.setLength(0);
                        } else {
                            sb2.append(cCharAt);
                        }
                    }
                    if (!TextUtils.isEmpty(sb2)) {
                        arrayList.add(sb2);
                    }
                    if (((org.telegram.ui.Cells.z5) this.d).l(arrayList)) {
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
        switch (this.f7511c) {
            case 1:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.Cells.z5) this.d).k(this);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                if (motionEvent.getAction() != 1 || !((r41) this.d).f41282y.u()) {
                    return super.onTouchEvent(motionEvent);
                }
                AndroidUtilities.runOnUIThread(new n51(this, 1), 200L);
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        switch (this.f7511c) {
            case 1:
                ActionMode actionModeStartActionMode = super.startActionMode(callback, i10);
                ((org.telegram.ui.Cells.z5) this.d).g(this, actionModeStartActionMode);
                return actionModeStartActionMode;
            default:
                return super.startActionMode(callback, i10);
        }
    }

    public r(Context context, org.telegram.ui.ActionBar.c6 c6Var, Drawable drawable) {
        super(context, c6Var);
        this.f7511c = 0;
        this.d = drawable;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.f7511c) {
            case 1:
                ActionMode actionModeStartActionMode = super.startActionMode(callback);
                ((org.telegram.ui.Cells.z5) this.d).g(this, actionModeStartActionMode);
                return actionModeStartActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
