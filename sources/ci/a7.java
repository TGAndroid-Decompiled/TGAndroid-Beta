package ci;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class a7 {
    public int f5150a;
    public String f5151b;
    public TLRPC.Photo f5152c;
    public TLRPC.Document d;

    public static a7 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f5150a = tL_storyAlbum.album_id;
        obj.f5151b = tL_storyAlbum.title;
        obj.f5152c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
