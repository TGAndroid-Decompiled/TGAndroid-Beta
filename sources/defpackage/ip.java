package defpackage;

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
public final class ip extends EditText implements fs7, zsb {
    public final lo a;
    public final qq b;
    public final iq c;
    public final vmb d;
    public final qx6 e;
    public hp f;

    public ip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968776);
        xsb.a(context);
        brb.a(getContext(), this);
        lo loVar = new lo(this);
        this.a = loVar;
        loVar.g(attributeSet, 2130968776);
        qq qqVar = new qq(this);
        this.b = qqVar;
        qqVar.f(attributeSet, 2130968776);
        qqVar.b();
        ?? obj = new Object();
        obj.a = this;
        this.c = obj;
        this.d = new Object();
        qx6 qx6Var = new qx6(this);
        this.e = qx6Var;
        qx6Var.y(attributeSet, 2130968776);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener u = qx6Var.u(keyListener);
            if (u != keyListener) {
                super.setKeyListener(u);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    private hp getSuperCaller() {
        hp hpVar = this.f;
        if (hpVar == null) {
            hp hpVar2 = new hp(this);
            this.f = hpVar2;
            return hpVar2;
        }
        return hpVar;
    }

    @Override
    public final bw2 a(bw2 bw2Var) {
        this.d.getClass();
        return vmb.a(this, bw2Var);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        lo loVar = this.a;
        if (loVar != null) {
            loVar.b();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c0f.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return getEditableText();
    }

    @Override
    public TextClassifier getTextClassifier() {
        iq iqVar;
        if (Build.VERSION.SDK_INT < 28 && (iqVar = this.c) != null) {
            TextClassifier textClassifier = iqVar.b;
            if (textClassifier == null) {
                return hq.a(iqVar.a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        qq.h(editorInfo, onCreateInputConnection, this);
        xqd.a(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (g = ihc.g(this)) != null) {
            tu3.b(editorInfo, g);
            onCreateInputConnection = tpe.a(onCreateInputConnection, editorInfo, new e05(this, (byte) 12));
        }
        return this.e.z(onCreateInputConnection, editorInfo);
    }

    @Override
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && ihc.g(this) != null) {
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
                z = rp.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        xv2 xv2Var;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 && ihc.g(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i3 >= 31) {
                    xv2Var = new wv2(primaryClip, 1);
                } else {
                    yv2 yv2Var = new yv2();
                    yv2Var.b = primaryClip;
                    yv2Var.c = (byte) 1;
                    xv2Var = yv2Var;
                }
                if (i == 16908322) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                xv2Var.d(i2);
                ihc.j(this, xv2Var.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.i(i);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c0f.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.L(z);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.n(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        qq qqVar = this.b;
        qqVar.l(colorStateList);
        qqVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        qq qqVar = this.b;
        qqVar.m(mode);
        qqVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.g(context, i);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        iq iqVar;
        if (Build.VERSION.SDK_INT < 28 && (iqVar = this.c) != null) {
            iqVar.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }
}
