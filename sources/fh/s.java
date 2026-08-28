package fh;

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
import org.telegram.ui.Components.mt;
import org.telegram.ui.o51;
import org.telegram.ui.s41;
public final class s extends mt {
    public final int f6746c;
    public final Object d;

    public s(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.f6746c = i9;
        this.d = frameLayout;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f6746c) {
            case 0:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.d;
                drawable.setBounds(0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(28.0f));
                drawable.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public int emojiCacheType() {
        switch (this.f6746c) {
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
        switch (this.f6746c) {
            case 2:
                if (!hg.h0.f10609b) {
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
        switch (this.f6746c) {
            case 1:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                if (((org.telegram.ui.Cells.c6) this.d).f24202s) {
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
        switch (this.f6746c) {
            case 1:
                super.onDraw(canvas);
                ((org.telegram.ui.Cells.c6) this.d).getClass();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i9, Rect rect) {
        switch (this.f6746c) {
            case 1:
                super.onFocusChanged(z10, i9, rect);
                ((org.telegram.ui.Cells.c6) this.d).i(z10);
                return;
            case 2:
                if (z10) {
                    ((s41) this.d).f41692y.q();
                    AndroidUtilities.runOnUIThread(new o51(this, 0), 200L);
                }
                super.onFocusChanged(z10, i9, rect);
                return;
            default:
                super.onFocusChanged(z10, i9, rect);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f6746c) {
            case 3:
                super.onSizeChanged(i9, i10, i11, i12);
                postOnAnimation(new pf.o1(this, 22));
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i9) {
        ClipData primaryClip;
        switch (this.f6746c) {
            case 1:
                if (i9 == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && AndroidUtilities.charSequenceIndexOf(primaryClip.getItemAt(0).getText(), "\n") > 0) {
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
                    if (((org.telegram.ui.Cells.c6) this.d).l(arrayList)) {
                        return true;
                    }
                }
                return super.onTextContextMenuItem(i9);
            default:
                return super.onTextContextMenuItem(i9);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f6746c) {
            case 1:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.Cells.c6) this.d).k(this);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                if (motionEvent.getAction() == 1 && ((s41) this.d).f41692y.u()) {
                    AndroidUtilities.runOnUIThread(new o51(this, 1), 200L);
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i9) {
        switch (this.f6746c) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback, i9);
                ((org.telegram.ui.Cells.c6) this.d).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i9);
        }
    }

    public s(Context context, org.telegram.ui.ActionBar.b6 b6Var, Drawable drawable) {
        super(context, b6Var);
        this.f6746c = 0;
        this.d = drawable;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.f6746c) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback);
                ((org.telegram.ui.Cells.c6) this.d).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
