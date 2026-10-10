package ai;

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
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.p01;
public final class v9 implements gc {
    public final rm0 f1829a;
    public final p01 f1830b;
    public final int[] f1831c;
    public final boolean d;
    public u9 f1832e;
    public boolean f1833f;
    public boolean h;
    public boolean f1834n;
    public boolean f1835r;
    public int f1836s;

    public v9(rm0 rm0Var, boolean z10) {
        this.f1831c = new int[2];
        this.f1829a = rm0Var;
        this.d = z10;
        this.f1830b = null;
    }

    public static v9 a(rm0 rm0Var) {
        return new v9(rm0Var, false);
    }

    @Override
    public final void Z(long j3, int i10, e5 e5Var) {
        ArrayList arrayList;
        rm0 rm0Var = this.f1829a;
        if (rm0Var != null && (rm0Var.getParent() instanceof b0)) {
            b0 b0Var = (b0) rm0Var.getParent();
            if (b0Var.k(j3)) {
                b0Var.f663b0.add(e5Var);
                return;
            } else {
                e5Var.run();
                return;
            }
        }
        int i11 = 0;
        if (rm0Var != null && (rm0Var.getParent() instanceof l7)) {
            l7 l7Var = (l7) rm0Var.getParent();
            g00 g00Var = l7Var.f1343x;
            f7 f7Var = l7Var.f1342w;
            if (f7Var != null && (arrayList = f7Var.f1030c) != null && g00Var != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        a7 a7Var = (a7) arrayList.get(i11);
                        if (a7Var != null) {
                            TL_stories.StoryReaction storyReaction = a7Var.f645c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f20279id == i10) {
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
                    int L0 = g00Var.L0();
                    int N0 = g00Var.N0();
                    if (i11 < L0 || i11 > N0) {
                        g00Var.h1(i11, AndroidUtilities.dp(60.0f));
                        rm0Var.post(e5Var);
                        return;
                    }
                }
            }
            e5Var.run();
            return;
        }
        if (this.d) {
            m9 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f1406a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        e5Var.run();
    }

    @Override
    public final void b(boolean z10) {
        u9 u9Var = this.f1832e;
        if (u9Var != null) {
            u9Var.b(z10);
        }
    }

    public final void c(hc hcVar) {
        View view = hcVar.f1110g;
        if (view == null) {
            return;
        }
        if (view instanceof t9) {
            int[] iArr = this.f1831c;
            ((t9) view).a(iArr);
            hcVar.h = iArr[0];
            hcVar.f1111i = iArr[1] - this.f1836s;
        } else if (view instanceof org.telegram.ui.Components.la) {
            hcVar.h = ((org.telegram.ui.Components.la) view).V2;
            hcVar.f1111i = (view.getMeasuredHeight() - hcVar.f1110g.getPaddingBottom()) - this.f1836s;
        } else {
            hcVar.h = view.getPaddingTop();
            hcVar.f1111i = (hcVar.f1110g.getMeasuredHeight() - hcVar.f1110g.getPaddingBottom()) - this.f1836s;
        }
    }

    @Override
    public final boolean e1(long j3, int i10, int i11, int i12, hc hcVar) {
        b0 b0Var;
        ViewGroup viewGroup;
        boolean z10;
        ec ecVar = null;
        hcVar.f1105a = null;
        hcVar.f1106b = null;
        hcVar.f1107c = null;
        hcVar.f1108e = null;
        rm0 rm0Var = this.f1829a;
        if (rm0Var != null && (rm0Var.getParent() instanceof b0)) {
            b0Var = (b0) rm0Var.getParent();
        } else {
            b0Var = null;
        }
        if (b0Var != null && !b0Var.g()) {
            viewGroup = b0Var.f682r;
        } else {
            viewGroup = rm0Var;
        }
        ViewGroup viewGroup2 = this.f1830b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof a0) {
                    a0 a0Var = (a0) childAt;
                    if (a0Var.E == j3) {
                        hcVar.f1105a = childAt;
                        hcVar.f1106b = a0Var.f628r;
                        hcVar.f1115m = a0Var.O;
                        hcVar.d = a0Var.R;
                        b0 b0Var2 = (b0) a0Var.getParent().getParent();
                        hcVar.f1110g = b0Var2;
                        hcVar.f1111i = 0.0f;
                        hcVar.h = 0.0f;
                        hcVar.f1113k = 1.0f;
                        if (a0Var.G && b0Var2.g()) {
                            hcVar.f1109f = new a1.c(new Path(), 7);
                            return true;
                        }
                        hcVar.f1109f = ecVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                    ImageReceiver imageReceiver = s2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = s2Var.f22869u0;
                    int i14 = (s2Var.getDialogId() > j3 ? 1 : (s2Var.getDialogId() == j3 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i14 == 0 && !z11) || (z11 && s2Var.O())) {
                        hcVar.f1105a = childAt;
                        hcVar.f1115m = k2Var;
                        hcVar.f1106b = imageReceiver;
                        hcVar.f1110g = (View) s2Var.getParent();
                        if (z11) {
                            hcVar.f1114l = imageReceiver;
                            boolean z12 = k2Var.f857w;
                        }
                        hcVar.f1113k = 1.0f;
                        c(hcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        hcVar.f1105a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            hcVar.f1107c = u1Var.F9;
                        } else {
                            hcVar.f1107c = u1Var.getPhotoImage();
                        }
                        hcVar.f1110g = (View) u1Var.getParent();
                        hcVar.f1113k = 1.0f;
                        c(hcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        hcVar.f1105a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            hcVar.f1106b = w0Var.getPhotoImage();
                        } else {
                            hcVar.f1107c = w0Var.getPhotoImage();
                        }
                        hcVar.f1110g = (View) w0Var.getParent();
                        hcVar.f1113k = 1.0f;
                        c(hcVar);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.t7) && rm0Var != null) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    MessageObject messageObject = t7Var.getMessageObject();
                    if ((t7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        yl0 fastScroll = rm0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        hcVar.f1105a = childAt;
                        hcVar.f1107c = t7Var.f23069c;
                        hcVar.f1108e = new r5(t7Var, fastScroll, iArr, 1);
                        hcVar.f1110g = (View) t7Var.getParent();
                        hcVar.f1113k = 1.0f;
                        c(hcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                    org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) childAt;
                    if (xaVar.getDialogId() == j3) {
                        z5 z5Var = xaVar.f23740a;
                        hcVar.f1105a = z5Var;
                        hcVar.f1115m = xaVar.T;
                        hcVar.f1106b = z5Var.getImageReceiver();
                        hcVar.f1110g = (View) xaVar.getParent();
                        hcVar.f1113k = 1.0f;
                        c(hcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o6) {
                    org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                    org.telegram.ui.Components.y9 y9Var = o6Var.h;
                    if (o6Var.f22604y != j3) {
                        continue;
                    } else {
                        if (y9Var != null && y9Var.getImageReceiver() != null && y9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (o6Var.f22599n == i11 && z10) {
                            hcVar.f1105a = y9Var;
                            hcVar.f1107c = y9Var.getImageReceiver();
                            hcVar.f1110g = (View) o6Var.getParent();
                            float alphaInternal = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            hcVar.f1113k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                hcVar.f1112j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20872h5, o6Var.getResourcesProvider()));
                            }
                            c(hcVar);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.n6 n6Var = o6Var.f22596c;
                            hcVar.f1105a = n6Var;
                            hcVar.f1115m = o6Var.E;
                            hcVar.f1106b = n6Var.getImageReceiver();
                            hcVar.f1110g = (View) o6Var.getParent();
                            float alphaInternal2 = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            hcVar.f1113k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                hcVar.f1112j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20872h5, o6Var.getResourcesProvider()));
                            }
                            c(hcVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (i6Var.getDialogId() == j3) {
                        hcVar.f1105a = i6Var;
                        hcVar.f1115m = i6Var.f22270u0;
                        hcVar.f1106b = i6Var.f22265r;
                        hcVar.f1110g = (View) i6Var.getParent();
                        hcVar.f1113k = 1.0f;
                        c(hcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) childAt;
                    if (c8Var.getPostInfo().b() == i11) {
                        hcVar.f1105a = c8Var.getImageView();
                        hcVar.f1115m = c8Var.getStoryAvatarParams();
                        hcVar.f1107c = c8Var.getImageView().getImageReceiver();
                        hcVar.f1110g = (View) c8Var.getParent();
                        hcVar.f1113k = 1.0f;
                        c(hcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j3 && b5Var.getStoryItem().messageId == i10) {
                        hcVar.f1105a = b5Var.getAvatarImageView();
                        hcVar.f1115m = b5Var.getStoryAvatarParams();
                        hcVar.f1106b = b5Var.getAvatarImageView().getImageReceiver();
                        hcVar.f1110g = (View) b5Var.getParent();
                        hcVar.f1113k = 1.0f;
                        c(hcVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                ecVar = null;
            }
        }
        return false;
    }

    public v9(p01 p01Var) {
        this.f1831c = new int[2];
        this.f1830b = p01Var;
        this.f1829a = null;
    }
}
