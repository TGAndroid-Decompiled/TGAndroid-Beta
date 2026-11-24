package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.PhotoViewer;
public abstract class tz1 extends qu3 {
    public zb1 e2;
    public final ChatActivityEnterView f2;

    public tz1(ChatActivityEnterView chatActivityEnterView, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.f2 = chatActivityEnterView;
    }

    @Override
    public final void E() {
        uz1 uz1Var = this.f2.P3;
        if (uz1Var != null) {
            uz1Var.s1();
        }
    }

    @Override
    public final void F() {
        uz1 uz1Var = this.f2.P3;
        if (uz1Var != null) {
            uz1Var.e();
        }
    }

    public final void J(Uri uri, String str) {
        boolean z;
        yv1 yv1Var = this.f2.F3;
        if (yv1Var != null && yv1Var.x()) {
            z = true;
        } else {
            z = false;
        }
        Utilities.e.c(new co1(this, uri, gm.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), z), (byte) 11));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        yv1 yv1Var = chatActivityEnterView.F3;
        if (yv1Var != null && yv1Var.getParentActivity() != null) {
            jo6 jo6Var = (jo6) arrayList.get(0);
            if (chatActivityEnterView.p3) {
                gm.t1(this);
                gm.d3(new rz1(this, arrayList, file, (byte) 0), 100L);
                return;
            }
            PhotoViewer.r0().T1(null, yv1Var, chatActivityEnterView.L4);
            PhotoViewer.r0().o1(arrayList, 0, 2, false, new sz1(this, jo6Var, file), chatActivityEnterView.F3);
        }
    }

    public final void L(lj4 lj4Var, boolean z, int i, int i2) {
        k47 threadMessage;
        k47 threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        yv1 yv1Var = chatActivityEnterView.F3;
        j67 j67Var = chatActivityEnterView.M0;
        l3a l3aVar = null;
        if (j67Var != null) {
            j67Var.f(true);
            chatActivityEnterView.M0 = null;
        }
        nv1 nv1Var = chatActivityEnterView.L3;
        if (nv1Var != null && yv1Var != null && nv1Var.f) {
            yv1Var.uc();
            return;
        }
        fq5 fq5Var = (fq5) lj4Var.a;
        boolean hasMimeType = fq5Var.getDescription().hasMimeType("image/gif");
        j5 j5Var = chatActivityEnterView.S;
        if (hasMimeType) {
            Uri e = fq5Var.e();
            long j = chatActivityEnterView.G3;
            k47 k47Var = chatActivityEnterView.J3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            nv1 nv1Var2 = chatActivityEnterView.L3;
            if (yv1Var != null) {
                l3aVar = yv1Var.X6();
            }
            a6a.S(j5Var, null, null, e, null, "image/gif", j, k47Var, threadMessage2, null, nv1Var2, z, lj4Var, l3aVar);
        } else {
            Uri e2 = fq5Var.e();
            long j2 = chatActivityEnterView.G3;
            k47 k47Var2 = chatActivityEnterView.J3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            if (yv1Var != null) {
                l3aVar = yv1Var.X6();
            }
            a6a.X(j5Var, e2, j2, k47Var2, threadMessage, lj4Var, null, z, 0, l3aVar);
        }
        uz1 uz1Var = chatActivityEnterView.P3;
        if (uz1Var != null) {
            uz1Var.w(null, true, i, i2, 0L);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz1.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final ylb getResourcesProvider() {
        return this.f2.L4;
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        yv1 yv1Var = chatActivityEnterView.F3;
        if (yv1Var != null) {
            yv1Var.extendActionMode(menu);
        } else {
            chatActivityEnterView.B0(menu);
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i = ChatActivityEnterView.z7;
            if (chatActivityEnterView.R2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !chatActivityEnterView.w7) {
                lv3.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
            } else {
                lv3.b(editorInfo, null);
            }
            return dne.a(onCreateInputConnection, editorInfo, new cd1(this, (byte) 15));
        } catch (Throwable th) {
            fc4.g(th, true);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z = true;
        } else {
            z = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.f2;
        chatActivityEnterView.T = z;
        super.onMeasure(i, i2);
        if (chatActivityEnterView.T) {
            int lineCount = getLineCount();
            chatActivityEnterView.U = lineCount;
            if (lineCount > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z2 = true;
            } else {
                z2 = false;
            }
            chatActivityEnterView.V1(z2);
            if (chatActivityEnterView.U <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z3 = false;
            }
            chatActivityEnterView.b2(z3);
        }
        chatActivityEnterView.T = false;
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        uz1 uz1Var = this.f2.P3;
        if (uz1Var != null) {
            uz1Var.I();
        }
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        boolean z;
        bu5 bu5Var;
        sy1 sy1Var;
        super.onSelectionChanged(i, i2);
        ChatActivityEnterView chatActivityEnterView = this.f2;
        uz1 uz1Var = chatActivityEnterView.P3;
        if (uz1Var != null) {
            uz1Var.v();
        }
        rx1 rx1Var = chatActivityEnterView.R0;
        if (rx1Var != null) {
            if (chatActivityEnterView.F3 != null && (sy1Var = chatActivityEnterView.F0) != null && sy1Var.getSelectionEnd() != chatActivityEnterView.F0.getSelectionStart()) {
                z = true;
            } else {
                z = false;
            }
            if (rx1Var.x != z) {
                rx1Var.x = z;
                rx1Var.invalidate();
            }
            if (!z && (bu5Var = chatActivityEnterView.c7) != null) {
                bu5Var.u();
                chatActivityEnterView.c7 = null;
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f2;
            chatActivityEnterView.N2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.R2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (!chatActivityEnterView.u4 && chatActivityEnterView.r4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.Q0()) {
                zb1 zb1Var = this.e2;
                if (zb1Var == null) {
                    zb1Var = new zb1(this);
                    this.e2 = zb1Var;
                    zb1Var.h = new Runnable(this) {
                        public final tz1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r2;
                            tz1 tz1Var = this.b;
                            switch (b) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = tz1Var.f2;
                                    int i2 = ChatActivityEnterView.z7;
                                    chatActivityEnterView2.a2();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = tz1Var.f2;
                                    chatActivityEnterView3.b4 = false;
                                    chatActivityEnterView3.k1();
                                    return;
                            }
                        }
                    };
                }
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
                zb1Var.i = false;
                zb1Var.c = 0;
                zb1Var.a(rectF);
                return this.e2.b(motionEvent);
            } else if (chatActivityEnterView.R0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.R1(0, false);
                    chatActivityEnterView.V0.r(false);
                    requestFocus();
                }
                if (gm.D) {
                    i = 0;
                } else {
                    i = 2;
                }
                chatActivityEnterView.Z1(i, 0, true, true);
                if (chatActivityEnterView.p4) {
                    chatActivityEnterView.S1(false, true, false, true);
                    chatActivityEnterView.b4 = true;
                    gm.d3(new Runnable(this) {
                        public final tz1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r2;
                            tz1 tz1Var = this.b;
                            switch (b) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = tz1Var.f2;
                                    int i2 = ChatActivityEnterView.z7;
                                    chatActivityEnterView2.a2();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = tz1Var.f2;
                                    chatActivityEnterView3.b4 = false;
                                    chatActivityEnterView3.k1();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.k1();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.Q0()) {
            return false;
        }
        return super.requestFocus(i, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = gm.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f) {
        super.setOffsetY(f);
        ela elaVar = this.f2.c2;
        if (elaVar.getForeground() != null) {
            elaVar.invalidateDrawable(elaVar.getForeground());
        }
    }
}
