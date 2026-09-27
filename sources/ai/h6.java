package ai;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class h6 {
    public final int f948a;
    public final ImageReceiver f949b;
    public int f950c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.e6 f951f;
    public final org.telegram.ui.Components.e6 f952g;
    public final org.telegram.ui.Components.e6 h;
    public float f953i;
    public float f954j;
    public float f955k;
    public final boolean f956l;
    public final RectF f957m;
    public final RectF f958n;

    public h6(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f949b = imageReceiver;
        this.f950c = 0;
        this.d = false;
        this.e = 1.0f;
        sr srVar = sr.h;
        this.f951f = new org.telegram.ui.Components.e6(profileStoriesView, 420L, srVar);
        this.f952g = new org.telegram.ui.Components.e6(profileStoriesView, 420L, srVar);
        this.h = new org.telegram.ui.Components.e6(profileStoriesView, 420L, srVar);
        this.f957m = new RectF();
        this.f958n = new RectF();
        this.f948a = storyItem.f18564id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f956l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f31832x) {
            imageReceiver.onAttachedToWindow();
        }
        r20[] r20VarArr = ia.f1003a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            h9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, h9Var);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.clearImage();
            }
        }
    }
}
