package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.ProfilingResult;
import android.util.Log;
import android.view.View;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import org.telegram.messenger.FilesMigrationService;
public final class kz2 implements Consumer {
    public final byte a;
    public final Object b;
    public final Object c;

    public kz2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        int i;
        ox8 ox8Var;
        float f;
        float f2;
        float[] fArr;
        byte b = this.a;
        int i2 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((nz2) obj3).g((String) obj2, (ProfilingResult) obj);
                return;
            case 1:
                FilesMigrationService filesMigrationService = (FilesMigrationService) obj3;
                Path path = (Path) obj;
                boolean z = FilesMigrationService.c;
                File file = new File((File) obj2, path.getFileName().toString());
                if (Files.isDirectory(path, new LinkOption[0])) {
                    filesMigrationService.c(path.toFile(), file);
                    return;
                }
                try {
                    Files.move(path, file.toPath(), new CopyOption[0]);
                } catch (Exception e) {
                    fc4.g(e, false);
                    try {
                        path.toFile().delete();
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                }
                filesMigrationService.b++;
                if (System.currentTimeMillis() > 20 || filesMigrationService.b >= filesMigrationService.a - 1) {
                    gm.c3(new bm3(filesMigrationService, filesMigrationService.b, (byte) 8));
                    return;
                }
                return;
            case 2:
                iy8 iy8Var = (iy8) obj3;
                ox8 ox8Var2 = (ox8) obj2;
                Canvas canvas = (Canvas) obj;
                cz3 cz3Var = iy8Var.y;
                RectF rectF = cz3Var.N;
                WeakHashMap weakHashMap = cz3Var.O;
                Paint paint = cz3Var.c;
                long currentTimeMillis = System.currentTimeMillis() - cz3.g0;
                while (i2 < ox8Var2.getChildCount()) {
                    View childAt = ox8Var2.getChildAt(i2);
                    if ((childAt instanceof nx8) && childAt.getVisibility() == 0) {
                        if (!weakHashMap.containsKey(childAt)) {
                            weakHashMap.put(childAt, Boolean.TRUE);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(-1);
                            gradientDrawable.setCornerRadius(gm.L(10.0f));
                            f2 = 2.5f;
                            f = 10.0f;
                            childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) gm.N(2.5f))));
                        } else {
                            f = 10.0f;
                            f2 = 2.5f;
                        }
                        String key = ((nx8) childAt).getKey();
                        if (key != null && (fArr = (float[]) cz3Var.n.get(key)) != null) {
                            float b2 = cz3.b(fArr, currentTimeMillis);
                            if (b2 > 0.004f) {
                                float translationX = childAt.getTranslationX() + childAt.getLeft();
                                float translationY = childAt.getTranslationY() + childAt.getTop();
                                i = i2;
                                float N = (int) gm.N(f2);
                                ox8Var = ox8Var2;
                                rectF.set(translationX + N, translationY + N, (translationX + childAt.getWidth()) - N, (translationY + childAt.getHeight()) - N);
                                if (!childAt.isPressed()) {
                                    paint.setColor(788529151);
                                    paint.setAlpha((int) (46.0f * b2));
                                    canvas.drawRoundRect(rectF, gm.L(f), gm.L(f), paint);
                                }
                                i2 = i + 1;
                                ox8Var2 = ox8Var;
                            }
                        }
                    }
                    i = i2;
                    ox8Var = ox8Var2;
                    i2 = i + 1;
                    ox8Var2 = ox8Var;
                }
                if (!iy8Var.d.J.isEmpty()) {
                    iy8Var.y.invalidate();
                    return;
                }
                return;
            default:
                String str = (String) obj2;
                y03 y03Var = ((p8a) obj3).b;
                i90 i90Var = new i90(new j90(((Integer) obj).intValue()));
                try {
                    y03.g.getClass();
                    y03.g(y03Var.b.b(str, "profiling-manager-info"), w03.a.s(i90Var));
                    return;
                } catch (IOException e3) {
                    Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str, e3);
                    return;
                }
        }
    }

    public final Consumer andThen(Consumer consumer) {
        byte b = this.a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
