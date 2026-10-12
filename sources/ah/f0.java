package ah;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.es;
import org.telegram.ui.ak;
import org.telegram.ui.fo;
import org.telegram.ui.mk;
public final class f0 extends FrameLayout {
    public final fo f719a;
    public e0 f720b;
    public List f721c;
    public boolean d;
    public MessageObject e;
    public final int f722f;
    public final int h;
    public float f723n;
    public float f724r;
    public float f725s;
    public long v;
    public boolean f726w;
    public boolean f727x;
    public final int[] f728y;

    public f0(fo foVar, Context context) {
        super(context);
        this.f721c = Collections.EMPTY_LIST;
        this.f722f = 22;
        this.h = 24;
        this.f728y = new int[2];
        setVisibility(8);
        this.f719a = foVar;
        setClipToPadding(false);
        setClipChildren(false);
        foVar.f36160x0.j(new d0(this, 0));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new b0(this, 1));
            return;
        }
        this.f727x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new c0(this, 0));
        duration.addListener(new b(this, 1));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages D8;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f721c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f721c.get(0);
            if (messageObject.getGroupId() != 0 && (D8 = this.f719a.D8(messageObject.getGroupId())) != null && (arrayList = D8.messages) != null) {
                int size = arrayList.size();
                while (i10 < size) {
                    MessageObject messageObject2 = arrayList.get(i10);
                    i10++;
                    MessageObject messageObject3 = messageObject2;
                    TLRPC.Message message = messageObject3.messageOwner;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return messageObject3;
                    }
                }
            }
            return messageObject;
        }
        return null;
    }

    public final void c(boolean z10) {
        int height;
        int height2;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        if (this.d && this.e != null && this.f720b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.v);
            this.v = System.currentTimeMillis();
            float f7 = this.f723n;
            float f10 = this.f724r;
            if (f7 != f10) {
                float f11 = ((float) min) / 220.0f;
                if (f10 > f7) {
                    this.f723n = Math.min(f7 + f11, f10);
                } else if (f10 < f7) {
                    this.f723n = Math.max(f7 - f11, f10);
                }
                AndroidUtilities.runOnUIThread(new b0(this, 0));
            }
            fo foVar = this.f719a;
            ak akVar = foVar.f36160x0;
            int[] iArr = this.f728y;
            akVar.getLocationInWindow(iArr);
            boolean z13 = true;
            getLocationInWindow(iArr);
            float f12 = (iArr[1] - iArr[1]) - foVar.N9;
            boolean z14 = false;
            for (int i12 = 0; i12 < akVar.getChildCount(); i12++) {
                View childAt = akVar.getChildAt(i12);
                if (childAt instanceof u1) {
                    u1 u1Var = (u1) childAt;
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject.getId() == this.e.getId()) {
                        boolean isOutOwner = messageObject.isOutOwner();
                        e0 e0Var = this.f720b;
                        if (e0Var != null) {
                            e0Var.setMirrorX(isOutOwner);
                            e0 e0Var2 = this.f720b;
                            int dp = AndroidUtilities.dp(4.0f);
                            boolean z15 = LocaleController.isRTL;
                            int i13 = this.h;
                            if (!z15 && !isOutOwner) {
                                i11 = i13;
                            } else {
                                i11 = 0;
                            }
                            int i14 = dp + i11;
                            float f13 = this.f722f;
                            int dp2 = AndroidUtilities.dp(f13);
                            int dp3 = AndroidUtilities.dp(4.0f);
                            if (!LocaleController.isRTL && !isOutOwner) {
                                i13 = 0;
                            }
                            e0Var2.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(f13));
                        }
                        if (getHeight() != 0) {
                            height = getHeight();
                        } else {
                            height = akVar.getHeight();
                        }
                        if (u1Var.getCurrentMessagesGroup() != null) {
                            MessageObject.GroupedMessages.TransitionParams transitionParams = u1Var.getCurrentMessagesGroup().transitionParams;
                            height2 = transitionParams.bottom - transitionParams.top;
                        } else {
                            height2 = u1Var.getHeight();
                        }
                        float y3 = (u1Var.getY() + f12) - AndroidUtilities.dp(74.0f);
                        float dp4 = AndroidUtilities.dp(14.0f);
                        float dp5 = height - AndroidUtilities.dp(218.0f);
                        mk mkVar = foVar.X1;
                        if (mkVar != null && mkVar.getVisibility() == 0) {
                            dp4 += mkVar.getHeight();
                        }
                        float f14 = height2;
                        if (y3 > dp4 - (f14 / 2.0f) && y3 < dp5) {
                            this.f724r = 0.0f;
                            z11 = false;
                            z12 = true;
                        } else {
                            if (y3 >= (dp4 - f14) - AndroidUtilities.dp(92.0f) && y3 <= dp5) {
                                this.f725s = AndroidUtilities.dp(56.0f) + height2;
                                this.f724r = 1.0f;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        if (!z10) {
                            this.f723n = this.f724r;
                        }
                        float interpolation = (es.f24771f.getInterpolation(this.f723n) * this.f725s) + y3;
                        e0 e0Var3 = this.f720b;
                        if (e0Var3 != null) {
                            if (z11 != e0Var3.N) {
                                e0Var3.setFlippedVertically(z11);
                                AndroidUtilities.runOnUIThread(new b0(this, 0));
                            }
                            if (z12 != this.f720b.isEnabled()) {
                                this.f720b.setEnabled(z12);
                                this.f720b.invalidate();
                                if (z12) {
                                    this.f720b.setVisibility(0);
                                    if (!this.f727x) {
                                        this.f727x = true;
                                        this.f720b.p(this.e, foVar.Z7, true);
                                    }
                                }
                            }
                            this.f720b.setTranslationY(w7.s.a(interpolation, dp4, dp5));
                            this.f720b.setTranslationX(u1Var.E2(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f720b.getLayoutParams();
                            int c10 = org.telegram.messenger.q.c(32.0f, u1Var.getBackgroundDrawableLeft(), 0);
                            int c11 = org.telegram.messenger.q.c(32.0f, u1Var.getWidth() - u1Var.getBackgroundDrawableRight(), (int) u1Var.E2(true));
                            int dp6 = AndroidUtilities.dp(40.0f) * 8;
                            if ((getWidth() - c11) - c10 < dp6) {
                                if (isOutOwner) {
                                    c10 = Math.min(c10, getWidth() - dp6);
                                    c11 = 0;
                                } else {
                                    c11 = Math.min(c11, getWidth() - dp6);
                                    c10 = 0;
                                }
                            }
                            if (isOutOwner) {
                                i10 = 5;
                            } else {
                                i10 = 3;
                            }
                            if (i10 != layoutParams.gravity) {
                                layoutParams.gravity = i10;
                                z14 = true;
                            }
                            if (c10 != layoutParams.leftMargin) {
                                layoutParams.leftMargin = c10;
                                z14 = true;
                            }
                            if (c11 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = c11;
                            } else {
                                z13 = z14;
                            }
                            if (z13) {
                                this.f720b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            e0 e0Var4 = this.f720b;
            if (e0Var4 != null && e0Var4.isEnabled()) {
                this.f720b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.f726w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f726w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r10) {
        throw new UnsupportedOperationException("Method not decompiled: ah.f0.setSelectedMessages(java.util.List):void");
    }
}
