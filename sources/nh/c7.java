package nh;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.e01;
public final class c7 implements e9 {
    public final rl0 f15143a;
    public final e01 f15144b;
    public final int[] f15145c;
    public final boolean d;
    public b7 e;
    public boolean f15146f;
    public boolean h;
    public boolean f15147n;
    public boolean f15148r;
    public int f15149s;

    public c7(rl0 rl0Var, boolean z4) {
        this.f15145c = new int[2];
        this.f15143a = rl0Var;
        this.d = z4;
        this.f15144b = null;
    }

    public static c7 a(rl0 rl0Var) {
        return new c7(rl0Var, false);
    }

    @Override
    public final boolean V0(long j10, int i10, int i11, int i12, f9 f9Var) {
        q qVar;
        ViewGroup viewGroup;
        boolean z4;
        c9 c9Var = null;
        f9Var.f15312a = null;
        f9Var.f15313b = null;
        f9Var.f15314c = null;
        f9Var.e = null;
        rl0 rl0Var = this.f15143a;
        if (rl0Var != null && (rl0Var.getParent() instanceof q)) {
            qVar = (q) rl0Var.getParent();
        } else {
            qVar = null;
        }
        if (qVar != null && !qVar.g()) {
            viewGroup = qVar.f15756r;
        } else {
            viewGroup = rl0Var;
        }
        ViewGroup viewGroup2 = this.f15144b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof p) {
                    p pVar = (p) childAt;
                    if (pVar.B == j10) {
                        f9Var.f15312a = childAt;
                        f9Var.f15313b = pVar.f15711r;
                        f9Var.f15321m = pVar.L;
                        f9Var.d = pVar.O;
                        q qVar2 = (q) pVar.getParent().getParent();
                        f9Var.f15316g = qVar2;
                        f9Var.f15317i = 0.0f;
                        f9Var.h = 0.0f;
                        f9Var.f15319k = 1.0f;
                        if (pVar.D && qVar2.g()) {
                            f9Var.f15315f = new lh.m5(new Path(), 10);
                            return true;
                        }
                        f9Var.f15315f = c9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q2) {
                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) childAt;
                    ImageReceiver imageReceiver = q2Var.V1;
                    org.telegram.ui.Cells.i2 i2Var = q2Var.f21637r0;
                    long dialogId = q2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j10 && !z10) || (z10 && q2Var.O())) {
                        f9Var.f15312a = childAt;
                        f9Var.f15321m = i2Var;
                        f9Var.f15313b = imageReceiver;
                        f9Var.f15316g = (View) q2Var.getParent();
                        if (z10) {
                            f9Var.f15320l = imageReceiver;
                            boolean z11 = i2Var.f15418w;
                        }
                        f9Var.f15319k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject().getId() == i10) {
                        f9Var.f15312a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            f9Var.f15314c = s1Var.C9;
                        } else {
                            f9Var.f15314c = s1Var.getPhotoImage();
                        }
                        f9Var.f15316g = (View) s1Var.getParent();
                        f9Var.f15319k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().getId() == i10) {
                        f9Var.f15312a = childAt;
                        if (v0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            f9Var.f15313b = v0Var.getPhotoImage();
                        } else {
                            f9Var.f15314c = v0Var.getPhotoImage();
                        }
                        f9Var.f15316g = (View) v0Var.getParent();
                        f9Var.f15319k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.q7) && rl0Var != null) {
                    org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                    MessageObject messageObject = q7Var.getMessageObject();
                    if ((q7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        al0 fastScroll = rl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        f9Var.f15312a = childAt;
                        f9Var.f15314c = q7Var.f21702c;
                        f9Var.e = new androidx.car.app.utils.a(q7Var, fastScroll, iArr, 10);
                        f9Var.f15316g = (View) q7Var.getParent();
                        f9Var.f15319k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof ua) {
                    ua uaVar = (ua) childAt;
                    if (uaVar.getDialogId() == j10) {
                        y3 y3Var = uaVar.f22383a;
                        f9Var.f15312a = y3Var;
                        f9Var.f15321m = uaVar.Q;
                        f9Var.f15313b = y3Var.getImageReceiver();
                        f9Var.f15316g = (View) uaVar.getParent();
                        f9Var.f15319k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    org.telegram.ui.Components.p9 p9Var = m6Var.h;
                    if (m6Var.f21370x != j10) {
                        continue;
                    } else {
                        if (p9Var != null && p9Var.getImageReceiver() != null && p9Var.getImageReceiver().getImageDrawable() != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (m6Var.f21366n == i11 && z4) {
                            f9Var.f15312a = p9Var;
                            f9Var.f15314c = p9Var.getImageReceiver();
                            f9Var.f15316g = (View) m6Var.getParent();
                            float alphaInternal = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            f9Var.f15319k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                f9Var.f15318j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, m6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        } else if (!z4) {
                            org.telegram.ui.Cells.l6 l6Var = m6Var.f21364c;
                            f9Var.f15312a = l6Var;
                            f9Var.f15321m = m6Var.f21371y;
                            f9Var.f15313b = l6Var.getImageReceiver();
                            f9Var.f15316g = (View) m6Var.getParent();
                            float alphaInternal2 = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            f9Var.f15319k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                f9Var.f15318j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, m6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                    if (g6Var.getDialogId() == j10) {
                        f9Var.f15312a = g6Var;
                        f9Var.f15321m = g6Var.f21080r0;
                        f9Var.f15313b = g6Var.f21079r;
                        f9Var.f15316g = (View) g6Var.getParent();
                        f9Var.f15319k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.z7) {
                    org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) childAt;
                    if (z7Var.getPostInfo().b() == i11) {
                        f9Var.f15312a = z7Var.getImageView();
                        f9Var.f15321m = z7Var.getStoryAvatarParams();
                        f9Var.f15314c = z7Var.getImageView().getImageReceiver();
                        f9Var.f15316g = (View) z7Var.getParent();
                        f9Var.f15319k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j10 && a5Var.getStoryItem().messageId == i10) {
                        f9Var.f15312a = a5Var.getAvatarImageView();
                        f9Var.f15321m = a5Var.getStoryAvatarParams();
                        f9Var.f15313b = a5Var.getAvatarImageView().getImageReceiver();
                        f9Var.f15316g = (View) a5Var.getParent();
                        f9Var.f15319k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                c9Var = null;
            }
        }
        return false;
    }

    @Override
    public final void b(boolean z4) {
        b7 b7Var = this.e;
        if (b7Var != null) {
            b7Var.b(z4);
        }
    }

    public final void c(f9 f9Var) {
        View view = f9Var.f15316g;
        if (view == null) {
            return;
        }
        if (view instanceof a7) {
            int[] iArr = this.f15145c;
            ((a7) view).a(iArr);
            f9Var.h = iArr[0];
            f9Var.f15317i = iArr[1] - this.f15149s;
        } else if (view instanceof aa) {
            f9Var.h = ((aa) view).U2;
            f9Var.f15317i = (view.getMeasuredHeight() - f9Var.f15316g.getPaddingBottom()) - this.f15149s;
        } else {
            f9Var.h = view.getPaddingTop();
            f9Var.f15317i = (f9Var.f15316g.getMeasuredHeight() - f9Var.f15316g.getPaddingBottom()) - this.f15149s;
        }
    }

    @Override
    public final void z0(long j10, int i10, k3 k3Var) {
        ArrayList arrayList;
        rl0 rl0Var = this.f15143a;
        if (rl0Var != null && (rl0Var.getParent() instanceof q)) {
            q qVar = (q) rl0Var.getParent();
            if (qVar.k(j10)) {
                qVar.V.add(k3Var);
                return;
            } else {
                k3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (rl0Var != null && (rl0Var.getParent() instanceof d5)) {
            d5 d5Var = (d5) rl0Var.getParent();
            pz pzVar = d5Var.f15253x;
            z4 z4Var = d5Var.f15252w;
            if (z4Var != null && (arrayList = z4Var.f16099c) != null && pzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        u4 u4Var = (u4) arrayList.get(i11);
                        if (u4Var != null) {
                            TL_stories.StoryReaction storyReaction = u4Var.f15941c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f19394id == i10) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 >= 0) {
                    int L0 = pzVar.L0();
                    int N0 = pzVar.N0();
                    if (i11 < L0 || i11 > N0) {
                        pzVar.h1(i11, AndroidUtilities.dp(60.0f));
                        rl0Var.post(k3Var);
                        return;
                    }
                }
            }
            k3Var.run();
            return;
        }
        if (this.d) {
            t6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f15897a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        k3Var.run();
    }

    public c7(e01 e01Var) {
        this.f15145c = new int[2];
        this.f15144b = e01Var;
        this.f15143a = null;
    }
}
