package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;
public abstract class s1 {
    public static final Field f14961a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f14961a = field;
    }
}
