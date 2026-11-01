package m;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import w7.y7;
public final class s extends EditText implements r0.n, u0.l {
    public final e2.c f12542a;
    public final w0 f12543b;
    public final y f12544c;
    public final u0.k d;
    public final y e;
    public r f12545f;

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968776);
        b3.a(context);
        a3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f12542a = cVar;
        cVar.k(attributeSet, 2130968776);
        w0 w0Var = new w0(this);
        this.f12543b = w0Var;
        w0Var.f(attributeSet, 2130968776);
        w0Var.b();
        y yVar = new y();
        yVar.f12597b = this;
        this.f12544c = yVar;
        this.d = new Object();
        y yVar2 = new y(this);
        this.e = yVar2;
        yVar2.b(attributeSet, 2130968776);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a2 = yVar2.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    private r getSuperCaller() {
        if (this.f12545f == null) {
            this.f12545f = new r(this);
        }
        return this.f12545f;
    }

    @Override
    public final r0.g a(r0.g gVar) {
        this.d.getClass();
        return u0.k.a(this, gVar);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f12542a;
        if (cVar != null) {
            cVar.b();
        }
        w0 w0Var = this.f12543b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return y7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f12542a;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f12542a;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12543b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12543b.e();
    }

    @Override
    public TextClassifier getTextClassifier() {
        y yVar;
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f12544c) != null) {
            TextClassifier textClassifier = (TextClassifier) yVar.f12598c;
            if (textClassifier == null) {
                return q0.a((TextView) yVar.f12597b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] e;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f12543b.getClass();
        w0.h(editorInfo, onCreateInputConnection, this);
        w7.s.a(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (e = r0.h0.e(this)) != null) {
            t0.b.b(editorInfo, e);
            onCreateInputConnection = t0.f.a(onCreateInputConnection, editorInfo, new rh.d0(this, 9));
        }
        return this.e.c(onCreateInputConnection, editorInfo);
    }

    @Override
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && r0.h0.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = b0.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        r0.d dVar;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 31 && r0.h0.e(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i12 >= 31) {
                    dVar = new j2.k(primaryClip, 1);
                } else {
                    r0.e eVar = new r0.e();
                    eVar.f46122b = primaryClip;
                    eVar.f46123c = 1;
                    dVar = eVar;
                }
                if (i10 == 16908322) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                dVar.c(i11);
                r0.h0.h(this, dVar.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f12542a;
        if (cVar != null) {
            cVar.l();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f12542a;
        if (cVar != null) {
            cVar.m(i10);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f12543b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f12543b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.e.d(z10);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f12542a;
        if (cVar != null) {
            cVar.q(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f12542a;
        if (cVar != null) {
            cVar.r(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f12543b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f12543b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w0 w0Var = this.f12543b;
        if (w0Var != null) {
            w0Var.g(context, i10);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f12544c) != null) {
            yVar.f12598c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    @Override
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return getEditableText();
    }
}
