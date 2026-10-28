package di;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.z20;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class s4 {
    public final int f9144a;
    public final ImageReceiver f9145b;
    public int f9146c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.h6 f9147f;
    public final org.telegram.ui.Components.h6 f9148g;
    public final org.telegram.ui.Components.h6 h;
    public float f9149i;
    public float f9150j;
    public float f9151k;
    public final boolean f9152l;
    public final RectF f9153m;
    public final RectF f9154n;

    public s4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f9145b = imageReceiver;
        this.f9146c = 0;
        this.d = false;
        this.e = 1.0f;
        ds dsVar = ds.h;
        this.f9147f = new org.telegram.ui.Components.h6(profileStoriesView, 420L, dsVar);
        this.f9148g = new org.telegram.ui.Components.h6(profileStoriesView, 420L, dsVar);
        this.h = new org.telegram.ui.Components.h6(profileStoriesView, 420L, dsVar);
        this.f9153m = new RectF();
        this.f9154n = new RectF();
        this.f9144a = storyItem.f22267id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f9152l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f36282x) {
            imageReceiver.onAttachedToWindow();
        }
        z20[] z20VarArr = a8.f8378a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            j9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, j9Var);
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
