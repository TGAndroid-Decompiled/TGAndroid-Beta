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
import b8.zd;
public final class s extends EditText implements r0.n, u0.k {
    public final g2.d f18724a;
    public final w0 f18725b;
    public final y f18726c;
    public final u0.j d;
    public final y f18727e;
    public r f18728f;

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968776);
        a3.a(context);
        z2.a(this, getContext());
        g2.d dVar = new g2.d(this);
        this.f18724a = dVar;
        dVar.x(attributeSet, 2130968776);
        w0 w0Var = new w0(this);
        this.f18725b = w0Var;
        w0Var.f(attributeSet, 2130968776);
        w0Var.b();
        y yVar = new y();
        yVar.f18784b = this;
        this.f18726c = yVar;
        this.d = new Object();
        y yVar2 = new y(this);
        this.f18727e = yVar2;
        yVar2.b(attributeSet, 2130968776);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a10 = yVar2.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    private r getSuperCaller() {
        if (this.f18728f == null) {
            this.f18728f = new r(this);
        }
        return this.f18728f;
    }

    @Override
    public final r0.g a(r0.g gVar) {
        this.d.getClass();
        return u0.j.a(this, gVar);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        g2.d dVar = this.f18724a;
        if (dVar != null) {
            dVar.b();
        }
        w0 w0Var = this.f18725b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return x7.g0.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        g2.d dVar = this.f18724a;
        if (dVar != null) {
            return dVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        g2.d dVar = this.f18724a;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18725b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18725b.e();
    }

    @Override
    public TextClassifier getTextClassifier() {
        y yVar;
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f18726c) != null) {
            TextClassifier textClassifier = (TextClassifier) yVar.f18785c;
            if (textClassifier == null) {
                return q0.a((TextView) yVar.f18784b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] e10;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f18725b.getClass();
        w0.h(editorInfo, onCreateInputConnection, this);
        zd.a(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (e10 = r0.i0.e(this)) != null) {
            t0.b.b(editorInfo, e10);
            onCreateInputConnection = t0.f.a(onCreateInputConnection, editorInfo, new org.telegram.ui.ActionBar.e3(this, 10));
        }
        return this.f18727e.c(onCreateInputConnection, editorInfo);
    }

    @Override
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i3 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i3 < 31 && i3 >= 24 && dragEvent.getLocalState() == null && r0.i0.e(this) != null) {
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
    public final boolean onTextContextMenuItem(int i3) {
        ClipData primaryClip;
        r0.d dVar;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 && r0.i0.e(this) != null && (i3 == 16908322 || i3 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i11 >= 31) {
                    dVar = new l2.j(primaryClip, 1);
                } else {
                    r0.e eVar = new r0.e();
                    eVar.f53999b = primaryClip;
                    eVar.f54000c = 1;
                    dVar = eVar;
                }
                if (i3 == 16908322) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                dVar.c(i10);
                r0.i0.h(this, dVar.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i3);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        g2.d dVar = this.f18724a;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        g2.d dVar = this.f18724a;
        if (dVar != null) {
            dVar.z(i3);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18725b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18725b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x7.g0.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f18727e.d(z10);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f18727e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        g2.d dVar = this.f18724a;
        if (dVar != null) {
            dVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        g2.d dVar = this.f18724a;
        if (dVar != null) {
            dVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f18725b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f18725b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        w0 w0Var = this.f18725b;
        if (w0Var != null) {
            w0Var.g(context, i3);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f18726c) != null) {
            yVar.f18785c = textClassifier;
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
