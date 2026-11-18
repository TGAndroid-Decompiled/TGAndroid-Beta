package fi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class b4 {
    public final int f11768a;
    public final ImageReceiver f11769b;
    public int f11770c;
    public boolean d;
    public float f11771e;
    public final org.telegram.ui.Components.c6 f11772f;
    public final org.telegram.ui.Components.c6 f11773g;
    public final org.telegram.ui.Components.c6 h;
    public float f11774i;
    public float f11775j;
    public float f11776k;
    public final boolean f11777l;
    public final RectF f11778m;
    public final RectF f11779n;

    public b4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f11769b = imageReceiver;
        this.f11770c = 0;
        this.d = false;
        this.f11771e = 1.0f;
        lr lrVar = lr.h;
        this.f11772f = new org.telegram.ui.Components.c6(profileStoriesView, 420L, lrVar);
        this.f11773g = new org.telegram.ui.Components.c6(profileStoriesView, 420L, lrVar);
        this.h = new org.telegram.ui.Components.c6(profileStoriesView, 420L, lrVar);
        this.f11778m = new RectF();
        this.f11779n = new RectF();
        this.f11768a = storyItem.f28644id;
        imageReceiver.J0(org.telegram.messenger.g0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.f11777l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f43826y) {
            imageReceiver.P();
        }
        p10[] p10VarArr = i7.f12115a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject g22 = mp.u1(imageReceiver.d).g2(storyItem.dialogId);
            b9Var.l(g22);
            imageReceiver.i0(g22, b9Var, null);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.r0(fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ec.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.u0(null, null, fc.i(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ec.m(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.f();
            }
        }
    }
}
