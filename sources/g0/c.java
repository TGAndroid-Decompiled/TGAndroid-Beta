package g0;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e0.p0;
import f0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f7053a;
    public String f7054b;
    public Intent[] f7055c;
    public ComponentName d;
    public CharSequence f7056e;
    public CharSequence f7057f;
    public CharSequence f7058g;
    public IconCompat h;
    public p0[] f7059i;
    public Set f7060j;
    public h f7061k;
    public boolean f7062l;
    public int f7063m;
    public PersistableBundle f7064n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f7054b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f7055c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f7053a, this.f7054b).setShortLabel(this.f7056e).setIntents(this.f7055c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f7053a));
        }
        if (!TextUtils.isEmpty(this.f7057f)) {
            intents.setLongLabel(this.f7057f);
        }
        if (!TextUtils.isEmpty(this.f7058g)) {
            intents.setDisabledMessage(this.f7058g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f7060j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f7063m);
        PersistableBundle persistableBundle = this.f7064n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i9 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            p0[] p0VarArr = this.f7059i;
            if (p0VarArr != null && p0VarArr.length > 0) {
                int length = p0VarArr.length;
                Person[] personArr = new Person[length];
                while (i9 < length) {
                    p0 p0Var = this.f7059i[i9];
                    p0Var.getClass();
                    personArr[i9] = d1.f.D(p0Var);
                    i9++;
                }
                intents.setPersons(personArr);
            }
            h hVar = this.f7061k;
            if (hVar != null) {
                intents.setLocusId(hVar.f5297b);
            }
            intents.setLongLived(this.f7062l);
        } else {
            if (this.f7064n == null) {
                this.f7064n = new PersistableBundle();
            }
            p0[] p0VarArr2 = this.f7059i;
            if (p0VarArr2 != null && p0VarArr2.length > 0) {
                this.f7064n.putInt("extraPersonCount", p0VarArr2.length);
                while (i9 < this.f7059i.length) {
                    PersistableBundle persistableBundle2 = this.f7064n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i9 + 1;
                    sb2.append(i10);
                    String sb3 = sb2.toString();
                    p0 p0Var2 = this.f7059i[i9];
                    p0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = p0Var2.f4749a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", p0Var2.f4751c);
                    persistableBundle3.putString("key", p0Var2.d);
                    persistableBundle3.putBoolean("isBot", p0Var2.f4752e);
                    persistableBundle3.putBoolean("isImportant", p0Var2.f4753f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i9 = i10;
                }
            }
            h hVar2 = this.f7061k;
            if (hVar2 != null) {
                this.f7064n.putString("extraLocusId", hVar2.f5296a);
            }
            this.f7064n.putBoolean("extraLongLived", this.f7062l);
            intents.setExtras(this.f7064n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.f(intents);
        }
        return intents.build();
    }
}
