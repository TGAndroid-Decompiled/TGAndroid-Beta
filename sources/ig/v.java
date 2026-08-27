package ig;

import ag.r1;
import ag.z2;
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
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.er;
import org.telegram.ui.kj;
import org.telegram.ui.rn;
import org.telegram.ui.xj;

public final class v extends FrameLayout {

    public final rn f11457a;

    public u f11458b;

    public List f11459c;
    public boolean d;

    public MessageObject f11460e;

    public final int f11461f;
    public final int h;

    public float f11462n;

    public float f11463r;

    public float f11464s;
    public long v;

    public boolean f11465w;

    public boolean f11466x;

    public final int[] f11467y;

    public v(rn rnVar, Context context) {
        super(context);
        this.f11459c = Collections.EMPTY_LIST;
        this.f11461f = 22;
        this.h = 24;
        this.f11467y = new int[2];
        setVisibility(8);
        this.f11457a = rnVar;
        setClipToPadding(false);
        setClipChildren(false);
        rnVar.f42213t0.j(new z2(this, 10));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new t(this, 1));
            return;
        }
        this.f11466x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ag.u(this, 12));
        duration.addListener(new r1(this, 9));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages groupedMessagesY8;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (!this.d || this.f11459c.isEmpty()) {
            return null;
        }
        int i10 = 0;
        MessageObject messageObject = (MessageObject) this.f11459c.get(0);
        if (messageObject.getGroupId() != 0 && (groupedMessagesY8 = this.f11457a.y8(messageObject.getGroupId())) != null && (arrayList = groupedMessagesY8.messages) != null) {
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

    public final void c(boolean z10) {
        int height;
        boolean z11;
        boolean z12;
        float interpolation;
        u uVar;
        FrameLayout.LayoutParams layoutParams;
        int iD;
        int iD2;
        int iDp;
        int i10;
        if (!this.d || this.f11460e == null || this.f11458b == null) {
            return;
        }
        long jMin = Math.min(16L, System.currentTimeMillis() - this.v);
        this.v = System.currentTimeMillis();
        float f10 = this.f11462n;
        float f11 = this.f11463r;
        if (f10 != f11) {
            float f12 = jMin / 220.0f;
            if (f11 > f10) {
                this.f11462n = Math.min(f10 + f12, f11);
            } else if (f11 < f10) {
                this.f11462n = Math.max(f10 - f12, f11);
            }
            AndroidUtilities.runOnUIThread(new t(this, 0));
        }
        rn rnVar = this.f11457a;
        kj kjVar = rnVar.f42213t0;
        int[] iArr = this.f11467y;
        kjVar.getLocationInWindow(iArr);
        boolean z13 = true;
        float f13 = iArr[1];
        getLocationInWindow(iArr);
        float f14 = (f13 - iArr[1]) - rnVar.J9;
        boolean z14 = false;
        for (int i11 = 0; i11 < kjVar.getChildCount(); i11++) {
            View childAt = kjVar.getChildAt(i11);
            if (childAt instanceof s1) {
                s1 s1Var = (s1) childAt;
                MessageObject messageObject = s1Var.getMessageObject();
                if (messageObject.getId() == this.f11460e.getId()) {
                    boolean zIsOutOwner = messageObject.isOutOwner();
                    u uVar2 = this.f11458b;
                    if (uVar2 != null) {
                        uVar2.setMirrorX(zIsOutOwner);
                        u uVar3 = this.f11458b;
                        int iDp2 = AndroidUtilities.dp(4.0f);
                        boolean z15 = LocaleController.isRTL;
                        int i12 = this.h;
                        int i13 = iDp2 + ((z15 || zIsOutOwner) ? 0 : i12);
                        float f15 = this.f11461f;
                        int iDp3 = AndroidUtilities.dp(f15);
                        int iDp4 = AndroidUtilities.dp(4.0f);
                        if (!LocaleController.isRTL && !zIsOutOwner) {
                            i12 = 0;
                        }
                        uVar3.setPadding(i13, iDp3, iDp4 + i12, AndroidUtilities.dp(f15));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : kjVar.getHeight();
                    if (s1Var.getCurrentMessagesGroup() != null) {
                        MessageObject.GroupedMessages.TransitionParams transitionParams = s1Var.getCurrentMessagesGroup().transitionParams;
                        height = transitionParams.bottom - transitionParams.top;
                    } else {
                        height = s1Var.getHeight();
                    }
                    float y10 = (s1Var.getY() + f14) - AndroidUtilities.dp(74.0f);
                    float fDp = AndroidUtilities.dp(14.0f);
                    float fDp2 = height2 - AndroidUtilities.dp(218.0f);
                    xj xjVar = rnVar.T1;
                    if (xjVar != null && xjVar.getVisibility() == 0) {
                        fDp += xjVar.getHeight();
                    }
                    float f16 = height;
                    if (y10 <= fDp - (f16 / 2.0f) || y10 >= fDp2) {
                        if (y10 < (fDp - f16) - AndroidUtilities.dp(92.0f) || y10 > fDp2) {
                            z11 = false;
                            z12 = false;
                        } else {
                            this.f11464s = AndroidUtilities.dp(56.0f) + height;
                            this.f11463r = 1.0f;
                            z11 = true;
                        }
                        if (!z10) {
                            this.f11462n = this.f11463r;
                        }
                        interpolation = (er.f28122f.getInterpolation(this.f11462n) * this.f11464s) + y10;
                        uVar = this.f11458b;
                        if (uVar == null) {
                            return;
                        }
                        if (z11 != uVar.J) {
                            uVar.setFlippedVertically(z11);
                            AndroidUtilities.runOnUIThread(new t(this, 0));
                        }
                        if (z12 != this.f11458b.isEnabled()) {
                            this.f11458b.setEnabled(z12);
                            this.f11458b.invalidate();
                            if (z12) {
                                this.f11458b.setVisibility(0);
                                if (!this.f11466x) {
                                    this.f11466x = true;
                                    this.f11458b.p(this.f11460e, rnVar.V7, true);
                                }
                            }
                        }
                        this.f11458b.setTranslationY(h7.n.a(interpolation, fDp, fDp2));
                        this.f11458b.setTranslationX(s1Var.D2(true));
                        layoutParams = (FrameLayout.LayoutParams) this.f11458b.getLayoutParams();
                        iD = i0.a.d(32.0f, s1Var.getBackgroundDrawableLeft(), 0);
                        iD2 = i0.a.d(32.0f, s1Var.getWidth() - s1Var.getBackgroundDrawableRight(), (int) s1Var.D2(true));
                        iDp = AndroidUtilities.dp(40.0f) * 8;
                        if ((getWidth() - iD2) - iD < iDp) {
                            if (zIsOutOwner) {
                                iD = Math.min(iD, getWidth() - iDp);
                                iD2 = 0;
                            } else {
                                iD2 = Math.min(iD2, getWidth() - iDp);
                                iD = 0;
                            }
                        }
                        if (zIsOutOwner) {
                            i10 = 5;
                        } else {
                            i10 = 3;
                        }
                        if (i10 != layoutParams.gravity) {
                            layoutParams.gravity = i10;
                            z14 = true;
                        }
                        if (iD != layoutParams.leftMargin) {
                            layoutParams.leftMargin = iD;
                            z14 = true;
                        }
                        if (iD2 != layoutParams.rightMargin) {
                            layoutParams.rightMargin = iD2;
                        } else {
                            z13 = z14;
                        }
                        if (z13) {
                            this.f11458b.requestLayout();
                            return;
                        }
                        return;
                    }
                    this.f11463r = 0.0f;
                    z11 = false;
                    z12 = true;
                    if (!z10) {
                        this.f11462n = this.f11463r;
                    }
                    interpolation = (er.f28122f.getInterpolation(this.f11462n) * this.f11464s) + y10;
                    uVar = this.f11458b;
                    if (uVar == null) {
                        return;
                    }
                    if (z11 != uVar.J) {
                        uVar.setFlippedVertically(z11);
                        AndroidUtilities.runOnUIThread(new t(this, 0));
                    }
                    if (z12 != this.f11458b.isEnabled()) {
                        this.f11458b.setEnabled(z12);
                        this.f11458b.invalidate();
                        if (z12) {
                            this.f11458b.setVisibility(0);
                            if (!this.f11466x) {
                                this.f11466x = true;
                                this.f11458b.p(this.f11460e, rnVar.V7, true);
                            }
                        }
                    }
                    this.f11458b.setTranslationY(h7.n.a(interpolation, fDp, fDp2));
                    this.f11458b.setTranslationX(s1Var.D2(true));
                    layoutParams = (FrameLayout.LayoutParams) this.f11458b.getLayoutParams();
                    iD = i0.a.d(32.0f, s1Var.getBackgroundDrawableLeft(), 0);
                    iD2 = i0.a.d(32.0f, s1Var.getWidth() - s1Var.getBackgroundDrawableRight(), (int) s1Var.D2(true));
                    iDp = AndroidUtilities.dp(40.0f) * 8;
                    if ((getWidth() - iD2) - iD < iDp) {
                        if (zIsOutOwner) {
                            iD = Math.min(iD, getWidth() - iDp);
                            iD2 = 0;
                        } else {
                            iD2 = Math.min(iD2, getWidth() - iDp);
                            iD = 0;
                        }
                    }
                    if (zIsOutOwner) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    if (i10 != layoutParams.gravity) {
                        layoutParams.gravity = i10;
                        z14 = true;
                    }
                    if (iD != layoutParams.leftMargin) {
                        layoutParams.leftMargin = iD;
                        z14 = true;
                    }
                    if (iD2 != layoutParams.rightMargin) {
                        layoutParams.rightMargin = iD2;
                    } else {
                        z13 = z14;
                    }
                    if (z13) {
                        this.f11458b.requestLayout();
                        return;
                    }
                    return;
                }
            }
        }
        u uVar4 = this.f11458b;
        if (uVar4 == null || !uVar4.isEnabled()) {
            return;
        }
        this.f11458b.setEnabled(false);
    }

    public final boolean d() {
        return this.d && !this.f11465w;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f11465w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(List<MessageObject> list) {
        TLRPC.ChatFull chatFull;
        TLRPC.Message message;
        this.f11459c = list;
        rn rnVar = this.f11457a;
        int i10 = rnVar.N3;
        boolean z10 = true;
        if (i10 == 1 || i10 == 5 || i10 == 6 || rnVar.A9() || rnVar.x() || (((chatFull = rnVar.V7) != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) || list.isEmpty())) {
            z10 = false;
            break;
        }
        long groupId = 0;
        boolean z11 = false;
        for (MessageObject messageObject : list) {
            if ((messageObject != null && (message = messageObject.messageOwner) != null && message.rich_message != null) || (messageObject != null && !messageObject.needDrawBluredPreview() && ((MessageObject.isPhoto(messageObject.messageOwner) && MessageObject.getMedia(messageObject.messageOwner).webpage == null) || (messageObject.getDocument() != null && (MessageObject.isVideoDocument(messageObject.getDocument()) || MessageObject.isGifDocument(messageObject.getDocument())))))) {
                if (!z11) {
                    groupId = messageObject.getGroupId();
                    z11 = true;
                } else if (groupId != messageObject.getGroupId() || groupId == 0) {
                }
            }
            z10 = false;
        }
        if (z10 != this.d) {
            this.d = z10;
            this.f11465w = false;
            a(z10);
        } else if (z10) {
            this.f11460e = b();
        }
    }
}
