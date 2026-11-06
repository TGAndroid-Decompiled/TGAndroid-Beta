package di;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;
public abstract class m8 {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 1) {
            new l8(storyItem).readParams(nativeByteBuffer, true);
            return;
        }
        throw new RuntimeException(jg.g.j(readInt32, "(story) can't read params version = "));
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        l8 l8Var = new l8(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(l8Var.getObjectSize());
            l8Var.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
