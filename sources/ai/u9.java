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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.r01;
public final class u9 implements fc {
    public final ll0 f1583a;
    public final r01 f1584b;
    public final int[] f1585c;
    public final boolean d;
    public t9 e;
    public boolean f1586f;
    public boolean h;
    public boolean f1587n;
    public boolean f1588r;
    public int f1589s;

    public u9(ll0 ll0Var, boolean z10) {
        this.f1585c = new int[2];
        this.f1583a = ll0Var;
        this.d = z10;
        this.f1584b = null;
    }

    public static u9 a(ll0 ll0Var) {
        return new u9(ll0Var, false);
    }

    @Override
    public final void Z(long j3, int i10, e5 e5Var) {
        ArrayList arrayList;
        ll0 ll0Var = this.f1583a;
        if (ll0Var != null && (ll0Var.getParent() instanceof b0)) {
            b0 b0Var = (b0) ll0Var.getParent();
            if (b0Var.k(j3)) {
                b0Var.f540b0.add(e5Var);
                return;
            } else {
                e5Var.run();
                return;
            }
        }
        int i11 = 0;
        if (ll0Var != null && (ll0Var.getParent() instanceof j7)) {
            j7 j7Var = (j7) ll0Var.getParent();
            pz pzVar = j7Var.f1052x;
            e7 e7Var = j7Var.f1051w;
            if (e7Var != null && (arrayList = e7Var.f766c) != null && pzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        z6 z6Var = (z6) arrayList.get(i11);
                        if (z6Var != null) {
                            TL_stories.StoryReaction storyReaction = z6Var.f1784c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f18344id == i10) {
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
                        ll0Var.post(e5Var);
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
            NotificationCenter.getInstance(storiesController.f1190a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
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
        View view = gcVar.f916g;
        if (view == null) {
            return;
        }
        if (view instanceof s9) {
            int[] iArr = this.f1585c;
            ((s9) view).a(iArr);
            gcVar.h = iArr[0];
            gcVar.f917i = iArr[1] - this.f1589s;
        } else if (view instanceof org.telegram.ui.Components.ga) {
            gcVar.h = ((org.telegram.ui.Components.ga) view).X2;
            gcVar.f917i = (view.getMeasuredHeight() - gcVar.f916g.getPaddingBottom()) - this.f1589s;
        } else {
            gcVar.h = view.getPaddingTop();
            gcVar.f917i = (gcVar.f916g.getMeasuredHeight() - gcVar.f916g.getPaddingBottom()) - this.f1589s;
        }
    }

    @Override
    public final boolean f1(long j3, int i10, int i11, int i12, gc gcVar) {
        b0 b0Var;
        ViewGroup viewGroup;
        boolean z10;
        dc dcVar = null;
        gcVar.f912a = null;
        gcVar.f913b = null;
        gcVar.f914c = null;
        gcVar.e = null;
        ll0 ll0Var = this.f1583a;
        if (ll0Var != null && (ll0Var.getParent() instanceof b0)) {
            b0Var = (b0) ll0Var.getParent();
        } else {
            b0Var = null;
        }
        if (b0Var != null && !b0Var.g()) {
            viewGroup = b0Var.f558r;
        } else {
            viewGroup = ll0Var;
        }
        ViewGroup viewGroup2 = this.f1584b;
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
                        gcVar.f912a = childAt;
                        gcVar.f913b = a0Var.f499r;
                        gcVar.f921m = a0Var.O;
                        gcVar.d = a0Var.R;
                        b0 b0Var2 = (b0) a0Var.getParent().getParent();
                        gcVar.f916g = b0Var2;
                        gcVar.f917i = 0.0f;
                        gcVar.h = 0.0f;
                        gcVar.f919k = 1.0f;
                        if (a0Var.G && b0Var2.g()) {
                            gcVar.f915f = new a1.c(new Path(), 7);
                            return true;
                        }
                        gcVar.f915f = dcVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.Y1;
                    org.telegram.ui.Cells.j2 j2Var = r2Var.f20756u0;
                    long dialogId = r2Var.getDialogId();
                    boolean z11 = this.d;
                    if ((dialogId == j3 && !z11) || (z11 && r2Var.O())) {
                        gcVar.f912a = childAt;
                        gcVar.f921m = j2Var;
                        gcVar.f913b = imageReceiver;
                        gcVar.f916g = (View) r2Var.getParent();
                        if (z11) {
                            gcVar.f920l = imageReceiver;
                            boolean z12 = j2Var.f665w;
                        }
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        gcVar.f912a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            gcVar.f914c = t1Var.F9;
                        } else {
                            gcVar.f914c = t1Var.getPhotoImage();
                        }
                        gcVar.f916g = (View) t1Var.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        gcVar.f912a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            gcVar.f913b = w0Var.getPhotoImage();
                        } else {
                            gcVar.f914c = w0Var.getPhotoImage();
                        }
                        gcVar.f916g = (View) w0Var.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.t7) && ll0Var != null) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    MessageObject messageObject = t7Var.getMessageObject();
                    if ((t7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        sk0 fastScroll = ll0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        gcVar.f912a = childAt;
                        gcVar.f914c = t7Var.f21361c;
                        gcVar.e = new r5(t7Var, fastScroll, iArr, 1);
                        gcVar.f916g = (View) t7Var.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.ab) {
                    org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) childAt;
                    if (abVar.getDialogId() == j3) {
                        z5 z5Var = abVar.f19793a;
                        gcVar.f912a = z5Var;
                        gcVar.f921m = abVar.T;
                        gcVar.f913b = z5Var.getImageReceiver();
                        gcVar.f916g = (View) abVar.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o6) {
                    org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                    org.telegram.ui.Components.u9 u9Var = o6Var.h;
                    if (o6Var.f20558x != j3) {
                        continue;
                    } else {
                        if (u9Var != null && u9Var.getImageReceiver() != null && u9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (o6Var.f20554n == i11 && z10) {
                            gcVar.f912a = u9Var;
                            gcVar.f914c = u9Var.getImageReceiver();
                            gcVar.f916g = (View) o6Var.getParent();
                            float alphaInternal = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            gcVar.f919k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                gcVar.f918j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18904h5, o6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.n6 n6Var = o6Var.f20552c;
                            gcVar.f912a = n6Var;
                            gcVar.f921m = o6Var.f20559y;
                            gcVar.f913b = n6Var.getImageReceiver();
                            gcVar.f916g = (View) o6Var.getParent();
                            float alphaInternal2 = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            gcVar.f919k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                gcVar.f918j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18904h5, o6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (i6Var.getDialogId() == j3) {
                        gcVar.f912a = i6Var;
                        gcVar.f921m = i6Var.f20227u0;
                        gcVar.f913b = i6Var.f20222r;
                        gcVar.f916g = (View) i6Var.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) childAt;
                    if (c8Var.getPostInfo().b() == i11) {
                        gcVar.f912a = c8Var.getImageView();
                        gcVar.f921m = c8Var.getStoryAvatarParams();
                        gcVar.f914c = c8Var.getImageView().getImageReceiver();
                        gcVar.f916g = (View) c8Var.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j3 && b5Var.getStoryItem().messageId == i10) {
                        gcVar.f912a = b5Var.getAvatarImageView();
                        gcVar.f921m = b5Var.getStoryAvatarParams();
                        gcVar.f913b = b5Var.getAvatarImageView().getImageReceiver();
                        gcVar.f916g = (View) b5Var.getParent();
                        gcVar.f919k = 1.0f;
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

    public u9(r01 r01Var) {
        this.f1585c = new int[2];
        this.f1584b = r01Var;
        this.f1583a = null;
    }
}
