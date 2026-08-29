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
import i7.d8;
public final class t extends EditText implements r0.p, u0.k {
    public final n f16693a;
    public final x0 f16694b;
    public final z f16695c;
    public final u0.j d;
    public final z f16696e;
    public s f16697f;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968776);
        e3.a(context);
        d3.a(this, getContext());
        n nVar = new n(this);
        this.f16693a = nVar;
        nVar.d(attributeSet, 2130968776);
        x0 x0Var = new x0(this);
        this.f16694b = x0Var;
        x0Var.f(attributeSet, 2130968776);
        x0Var.b();
        z zVar = new z();
        zVar.f16753b = this;
        this.f16695c = zVar;
        this.d = new Object();
        z zVar2 = new z(this);
        this.f16696e = zVar2;
        zVar2.b(attributeSet, 2130968776);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a2 = zVar2.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    private s getSuperCaller() {
        if (this.f16697f == null) {
            this.f16697f = new s(this);
        }
        return this.f16697f;
    }

    @Override
    public final r0.h a(r0.h hVar) {
        this.d.getClass();
        return u0.j.a(this, hVar);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f16693a;
        if (nVar != null) {
            nVar.a();
        }
        x0 x0Var = this.f16694b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d8.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f16693a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f16693a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16694b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16694b.e();
    }

    @Override
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.f16695c) != null) {
            TextClassifier textClassifier = (TextClassifier) zVar.f16754c;
            if (textClassifier == null) {
                return r0.a((TextView) zVar.f16753b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] e10;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f16694b.getClass();
        x0.h(editorInfo, onCreateInputConnection, this);
        i7.u.a(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (e10 = r0.j0.e(this)) != null) {
            t0.b.b(editorInfo, e10);
            onCreateInputConnection = t0.f.a(onCreateInputConnection, editorInfo, new sf.f1(this, 2));
        }
        return this.f16696e.c(onCreateInputConnection, editorInfo);
    }

    @Override
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && r0.j0.e(this) != null) {
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
                z10 = c0.a(dragEvent, this, activity);
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
        r0.e eVar;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 31 && r0.j0.e(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i12 >= 31) {
                    eVar = new r0.d(primaryClip, 1);
                } else {
                    r0.f fVar = new r0.f();
                    fVar.f46809b = primaryClip;
                    fVar.f46810c = 1;
                    eVar = fVar;
                }
                if (i10 == 16908322) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                eVar.c(i11);
                r0.j0.i(this, eVar.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f16693a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f16693a;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16694b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16694b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d8.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f16696e.d(z10);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f16696e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f16693a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f16693a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f16694b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f16694b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x0 x0Var = this.f16694b;
        if (x0Var != null) {
            x0Var.g(context, i10);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.f16695c) != null) {
            zVar.f16754c = textClassifier;
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
