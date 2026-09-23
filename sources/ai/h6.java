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
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class h6 {
    public final int f945a;
    public final ImageReceiver f946b;
    public int f947c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.e6 f948f;
    public final org.telegram.ui.Components.e6 f949g;
    public final org.telegram.ui.Components.e6 h;
    public float f950i;
    public float f951j;
    public float f952k;
    public final boolean f953l;
    public final RectF f954m;
    public final RectF f955n;

    public h6(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f946b = imageReceiver;
        this.f947c = 0;
        this.d = false;
        this.e = 1.0f;
        rr rrVar = rr.h;
        this.f948f = new org.telegram.ui.Components.e6(profileStoriesView, 420L, rrVar);
        this.f949g = new org.telegram.ui.Components.e6(profileStoriesView, 420L, rrVar);
        this.h = new org.telegram.ui.Components.e6(profileStoriesView, 420L, rrVar);
        this.f954m = new RectF();
        this.f955n = new RectF();
        this.f945a = storyItem.f18318id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f953l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f31515x) {
            imageReceiver.onAttachedToWindow();
        }
        p20[] p20VarArr = ia.f1000a;
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
