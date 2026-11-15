package fi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class d4 {
    public final int f11624a;
    public final ImageReceiver f11625b;
    public int f11626c;
    public boolean d;
    public float f11627e;
    public final org.telegram.ui.Components.u5 f11628f;
    public final org.telegram.ui.Components.u5 f11629g;
    public final org.telegram.ui.Components.u5 h;
    public float f11630i;
    public float f11631j;
    public float f11632k;
    public final boolean f11633l;
    public final RectF f11634m;
    public final RectF f11635n;

    public d4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f11625b = imageReceiver;
        this.f11626c = 0;
        this.d = false;
        this.f11627e = 1.0f;
        er erVar = er.h;
        this.f11628f = new org.telegram.ui.Components.u5(profileStoriesView, 420L, erVar);
        this.f11629g = new org.telegram.ui.Components.u5(profileStoriesView, 420L, erVar);
        this.h = new org.telegram.ui.Components.u5(profileStoriesView, 420L, erVar);
        this.f11634m = new RectF();
        this.f11635n = new RectF();
        this.f11624a = storyItem.f28290id;
        imageReceiver.J0(org.telegram.messenger.g0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.f11633l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f43380y) {
            imageReceiver.P();
        }
        i10[] i10VarArr = l7.f12001a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject e22 = np.s1(imageReceiver.d).e2(storyItem.dialogId);
            t8Var.l(e22);
            imageReceiver.i0(e22, t8Var, null);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.r0(gc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, fc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.u0(null, null, gc.i(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, fc.m(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.f();
            }
        }
    }
}
