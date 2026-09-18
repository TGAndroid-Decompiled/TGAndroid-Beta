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
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.q01;
public final class u9 implements fc {
    public final wl0 f1586a;
    public final q01 f1587b;
    public final int[] f1588c;
    public final boolean d;
    public t9 e;
    public boolean f1589f;
    public boolean h;
    public boolean f1590n;
    public boolean f1591r;
    public int f1592s;

    public u9(wl0 wl0Var, boolean z10) {
        this.f1588c = new int[2];
        this.f1586a = wl0Var;
        this.d = z10;
        this.f1587b = null;
    }

    public static u9 a(wl0 wl0Var) {
        return new u9(wl0Var, false);
    }

    @Override
    public final void Z(long j3, int i10, e5 e5Var) {
        ArrayList arrayList;
        wl0 wl0Var = this.f1586a;
        if (wl0Var != null && (wl0Var.getParent() instanceof b0)) {
            b0 b0Var = (b0) wl0Var.getParent();
            if (b0Var.k(j3)) {
                b0Var.f543b0.add(e5Var);
                return;
            } else {
                e5Var.run();
                return;
            }
        }
        int i11 = 0;
        if (wl0Var != null && (wl0Var.getParent() instanceof j7)) {
            j7 j7Var = (j7) wl0Var.getParent();
            pz pzVar = j7Var.f1055x;
            e7 e7Var = j7Var.f1054w;
            if (e7Var != null && (arrayList = e7Var.f769c) != null && pzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        z6 z6Var = (z6) arrayList.get(i11);
                        if (z6Var != null) {
                            TL_stories.StoryReaction storyReaction = z6Var.f1787c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f18531id == i10) {
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
                        wl0Var.post(e5Var);
                        return;
                    }
                }
            }
            e5Var.run();
            return;
        }
        if (this.d) {
            l9 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f1193a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        e5Var.run();
    }

    @Override
    public final void b(boolean z10) {
        t9 t9Var = this.e;
        if (t9Var != null) {
            t9Var.b(z10);
        }
    }

    public final void c(gc gcVar) {
        View view = gcVar.f919g;
        if (view == null) {
            return;
        }
        if (view instanceof s9) {
            int[] iArr = this.f1588c;
            ((s9) view).a(iArr);
            gcVar.h = iArr[0];
            gcVar.f920i = iArr[1] - this.f1592s;
        } else if (view instanceof org.telegram.ui.Components.ia) {
            gcVar.h = ((org.telegram.ui.Components.ia) view).X2;
            gcVar.f920i = (view.getMeasuredHeight() - gcVar.f919g.getPaddingBottom()) - this.f1592s;
        } else {
            gcVar.h = view.getPaddingTop();
            gcVar.f920i = (gcVar.f919g.getMeasuredHeight() - gcVar.f919g.getPaddingBottom()) - this.f1592s;
        }
    }

    @Override
    public final boolean f1(long j3, int i10, int i11, int i12, gc gcVar) {
        b0 b0Var;
        ViewGroup viewGroup;
        boolean z10;
        dc dcVar = null;
        gcVar.f915a = null;
        gcVar.f916b = null;
        gcVar.f917c = null;
        gcVar.e = null;
        wl0 wl0Var = this.f1586a;
        if (wl0Var != null && (wl0Var.getParent() instanceof b0)) {
            b0Var = (b0) wl0Var.getParent();
        } else {
            b0Var = null;
        }
        if (b0Var != null && !b0Var.g()) {
            viewGroup = b0Var.f561r;
        } else {
            viewGroup = wl0Var;
        }
        ViewGroup viewGroup2 = this.f1587b;
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
                        gcVar.f915a = childAt;
                        gcVar.f916b = a0Var.f502r;
                        gcVar.f924m = a0Var.O;
                        gcVar.d = a0Var.R;
                        b0 b0Var2 = (b0) a0Var.getParent().getParent();
                        gcVar.f919g = b0Var2;
                        gcVar.f920i = 0.0f;
                        gcVar.h = 0.0f;
                        gcVar.f922k = 1.0f;
                        if (a0Var.G && b0Var2.g()) {
                            gcVar.f918f = new a1.c(new Path(), 7);
                            return true;
                        }
                        gcVar.f918f = dcVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                    ImageReceiver imageReceiver = s2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = s2Var.f20984u0;
                    long dialogId = s2Var.getDialogId();
                    boolean z11 = this.d;
                    if ((dialogId == j3 && !z11) || (z11 && s2Var.O())) {
                        gcVar.f915a = childAt;
                        gcVar.f924m = k2Var;
                        gcVar.f916b = imageReceiver;
                        gcVar.f919g = (View) s2Var.getParent();
                        if (z11) {
                            gcVar.f923l = imageReceiver;
                            boolean z12 = k2Var.f668w;
                        }
                        gcVar.f922k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        gcVar.f915a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            gcVar.f917c = u1Var.F9;
                        } else {
                            gcVar.f917c = u1Var.getPhotoImage();
                        }
                        gcVar.f919g = (View) u1Var.getParent();
                        gcVar.f922k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        gcVar.f915a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            gcVar.f916b = w0Var.getPhotoImage();
                        } else {
                            gcVar.f917c = w0Var.getPhotoImage();
                        }
                        gcVar.f919g = (View) w0Var.getParent();
                        gcVar.f922k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.t7) && wl0Var != null) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    MessageObject messageObject = t7Var.getMessageObject();
                    if ((t7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        dl0 fastScroll = wl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        gcVar.f915a = childAt;
                        gcVar.f917c = t7Var.f21178c;
                        gcVar.e = new r5(t7Var, fastScroll, iArr, 1);
                        gcVar.f919g = (View) t7Var.getParent();
                        gcVar.f922k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.za) {
                    org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) childAt;
                    if (zaVar.getDialogId() == j3) {
                        z5 z5Var = zaVar.f21891a;
                        gcVar.f915a = z5Var;
                        gcVar.f924m = zaVar.T;
                        gcVar.f916b = z5Var.getImageReceiver();
                        gcVar.f919g = (View) zaVar.getParent();
                        gcVar.f922k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o6) {
                    org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                    org.telegram.ui.Components.w9 w9Var = o6Var.h;
                    if (o6Var.f20732x != j3) {
                        continue;
                    } else {
                        if (w9Var != null && w9Var.getImageReceiver() != null && w9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (o6Var.f20728n == i11 && z10) {
                            gcVar.f915a = w9Var;
                            gcVar.f917c = w9Var.getImageReceiver();
                            gcVar.f919g = (View) o6Var.getParent();
                            float alphaInternal = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            gcVar.f922k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                gcVar.f921j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19133h5, o6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.n6 n6Var = o6Var.f20726c;
                            gcVar.f915a = n6Var;
                            gcVar.f924m = o6Var.f20733y;
                            gcVar.f916b = n6Var.getImageReceiver();
                            gcVar.f919g = (View) o6Var.getParent();
                            float alphaInternal2 = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            gcVar.f922k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                gcVar.f921j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19133h5, o6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (i6Var.getDialogId() == j3) {
                        gcVar.f915a = i6Var;
                        gcVar.f924m = i6Var.f20417u0;
                        gcVar.f916b = i6Var.f20412r;
                        gcVar.f919g = (View) i6Var.getParent();
                        gcVar.f922k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) childAt;
                    if (c8Var.getPostInfo().b() == i11) {
                        gcVar.f915a = c8Var.getImageView();
                        gcVar.f924m = c8Var.getStoryAvatarParams();
                        gcVar.f917c = c8Var.getImageView().getImageReceiver();
                        gcVar.f919g = (View) c8Var.getParent();
                        gcVar.f922k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j3 && b5Var.getStoryItem().messageId == i10) {
                        gcVar.f915a = b5Var.getAvatarImageView();
                        gcVar.f924m = b5Var.getStoryAvatarParams();
                        gcVar.f916b = b5Var.getAvatarImageView().getImageReceiver();
                        gcVar.f919g = (View) b5Var.getParent();
                        gcVar.f922k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                dcVar = null;
            }
        }
        return false;
    }

    public u9(q01 q01Var) {
        this.f1588c = new int[2];
        this.f1587b = q01Var;
        this.f1586a = null;
    }
}
