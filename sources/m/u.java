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
import w7.w7;
public final class u extends EditText implements r0.o, u0.k {
    public final e2.c f14987a;
    public final y0 f14988b;
    public final a0 f14989c;
    public final u0.j d;
    public final a0 e;
    public t f14990f;

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968776);
        e3.a(context);
        d3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f14987a = cVar;
        cVar.f(attributeSet, 2130968776);
        y0 y0Var = new y0(this);
        this.f14988b = y0Var;
        y0Var.f(attributeSet, 2130968776);
        y0Var.b();
        a0 a0Var = new a0();
        a0Var.f14788b = this;
        this.f14989c = a0Var;
        this.d = new Object();
        a0 a0Var2 = new a0(this);
        this.e = a0Var2;
        a0Var2.b(attributeSet, 2130968776);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a2 = a0Var2.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    private t getSuperCaller() {
        if (this.f14990f == null) {
            this.f14990f = new t(this);
        }
        return this.f14990f;
    }

    @Override
    public final r0.g a(r0.g gVar) {
        this.d.getClass();
        return u0.j.a(this, gVar);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f14987a;
        if (cVar != null) {
            cVar.b();
        }
        y0 y0Var = this.f14988b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f14987a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f14987a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14988b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14988b.e();
    }

    @Override
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT < 28 && (a0Var = this.f14989c) != null) {
            TextClassifier textClassifier = (TextClassifier) a0Var.f14789c;
            if (textClassifier == null) {
                return s0.a((TextView) a0Var.f14788b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] e;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f14988b.getClass();
        y0.h(editorInfo, onCreateInputConnection, this);
        w7.p.a(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (e = r0.i0.e(this)) != null) {
            t0.c.b(editorInfo, e);
            onCreateInputConnection = t0.g.a(onCreateInputConnection, editorInfo, new rg.b0(this, 7));
        }
        return this.e.c(onCreateInputConnection, editorInfo);
    }

    @Override
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && r0.i0.e(this) != null) {
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
                z10 = d0.a(dragEvent, this, activity);
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
        if (i12 < 31 && r0.i0.e(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i12 >= 31) {
                    dVar = new j2.j(primaryClip, 1);
                } else {
                    r0.e eVar = new r0.e();
                    eVar.f43467b = primaryClip;
                    eVar.f43468c = 1;
                    dVar = eVar;
                }
                if (i10 == 16908322) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                dVar.c(i11);
                r0.i0.h(this, dVar.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f14987a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f14987a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14988b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14988b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.e.d(z10);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f14987a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f14987a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f14988b;
        y0Var.l(colorStateList);
        y0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f14988b;
        y0Var.m(mode);
        y0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        y0 y0Var = this.f14988b;
        if (y0Var != null) {
            y0Var.g(context, i10);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT < 28 && (a0Var = this.f14989c) != null) {
            a0Var.f14789c = textClassifier;
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
